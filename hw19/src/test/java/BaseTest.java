import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    protected void initTests(){
        RestAssured.baseURI = "https://reqres.in/";
    }

    protected RequestSpecification postRequestSpecification(){
        return new RequestSpecBuilder()
                .addHeader("accept","application/json")
                .addHeader("Content-Type", "application/json")
                .build();
    }

    protected RequestSpecification getRequestSpecification(){
        return new RequestSpecBuilder()
                .addHeader("accept","application/json")
                .build();
    }
}
