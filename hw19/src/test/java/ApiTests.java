
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;

public class ApiTests extends BaseTest {

    @Description("Запрос на получение ресурса по существующему ид")
    @Test
    public void getSingleResourcePositive() {
        Root rootObject = given()
                .when()
                .spec(getRequestSpecification())
                .get("/api/unknown/2")
                .then()
                .statusCode(200)
                .extract()
                .as(Root.class);


        Root expectedData = Root.builder()
                .data(Data.builder()
                        .id(2)
                        .name("fuchsia rose")
                        .year(2001)
                        .color("#C74375")
                        .pantoneValue("17-2031")
                        .build())
                .support(Support.builder()
                        .url("https://reqres.in/#support-heading")
                        .text("To keep ReqRes free, contributions towards server costs are appreciated!")
                        .build())
                .build();

        Assert.assertEquals(rootObject, expectedData, "Response is not equals to expected data");
        Allure.addAttachment("Ответ", rootObject.toString());
    }

    @Description("Запрос на получение ресурса по не существующему ид")
    @Test
    public void getSingleResourceNegative() {
        String response = given()
                .when()
                .spec(getRequestSpecification())
                .get("/api/unknown/00000")
                .then()
                .statusCode(404)
                .extract()
                .asString();

        Assert.assertEquals(response, "{}", "Response is not equals to expected data");

        Allure.addAttachment("Ответ", response);

    }

    @Description("Запрос на регистрацию без обязательного параметра")
    @Test
    public void registerPositive() {
        byte[] body = new byte[0];
        try {
            body = Files.readAllBytes(Path.of("src/main/resources/registerWithParams.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Response userPostResponse = given()
                .spec(postRequestSpecification())
                .body(body)
                .post("/api/register")
                .then()
                .statusCode(200)
                .extract()
                .response();

        Assert.assertEquals("4", userPostResponse.jsonPath().getString("id"));
        Assert.assertEquals("QpwL5tke4Pnpja7X4", userPostResponse.jsonPath().getString("token"));

        Allure.addAttachment("Ответ", userPostResponse.body().asString());
    }

    @Description("Запрос на регистрацию без обязательного параметра")
    @Test
    public void registerNegative() {
        byte[] body = new byte[0];
        try {
            body = Files.readAllBytes(Path.of("src/main/resources/registerWithoutParam.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Response userPostResponse = given()
                .spec(postRequestSpecification())
                .body(body)
                .post("/api/register")
                .then()
                .statusCode(400)
                .extract()
                .response();

        Assert.assertEquals("Missing password", userPostResponse.jsonPath().getString("error"),
                "Response is not equals to expected data");
        Allure.addAttachment("Ответ", userPostResponse.body().asString());

    }

    @Description("Удаляем существующего юзера")
    @Test
    public void deleteExistUser() {

        String deleteUser = given()
                .spec(postRequestSpecification())
                .delete("/api/users/2")
                .then()
                .statusCode(204)
                .extract()
                .body().asString();

        Assert.assertEquals(deleteUser, "", "Response is not equals to expected data");
    }

    @Description("Удаляем не существующего юзера")
    @Test
    public void deleteNonExistUser() {

        String deleteUser = given()
                .spec(postRequestSpecification())
                .delete("/api/users/0")
                .then()
                .statusCode(204)
                .extract()
                .body().asString();

        Assert.assertEquals(deleteUser, "", "Response is not equals to expected data");
    }

    @Description("Обновляем данные юзера PUT запросом")
    @Test
    public void updateUserWithPut() {

        byte[] body = new byte[0];
        try {
            body = Files.readAllBytes(Path.of("src/main/resources/updateUser.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Response updateUser = given()
                .spec(postRequestSpecification())
                .body(body)
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        Assert.assertEquals("morpheus", updateUser.jsonPath().getString("name"));
        Assert.assertEquals("zion resident", updateUser.jsonPath().getString("job"));
        Assert.assertNotNull(updateUser.jsonPath().getString("updatedAt"));

        Allure.addAttachment("Ответ", updateUser.body().asString());
    }

    @Description("Обновляем данные юзера PATCH запросом")
    @Test
    public void updateUserWithPatch() {

        byte[] body = new byte[0];
        try {
            body = Files.readAllBytes(Path.of("src/main/resources/updateUser.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Response updateUser = given()
                .spec(postRequestSpecification())
                .body(body)
                .patch("/api/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        Assert.assertEquals("morpheus", updateUser.jsonPath().getString("name"));
        Assert.assertEquals("zion resident", updateUser.jsonPath().getString("job"));
        Assert.assertNotNull(updateUser.jsonPath().getString("updatedAt"));

        Allure.addAttachment("Ответ", updateUser.body().asString());
    }
}
