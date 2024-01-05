package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.$;

public class Upload {
    private static final Path BASE_FILE_DIR = Path.of("resources/filesForUpload");

    private SelenideElement fileUpload = $(By.id("file-upload")).shouldBe(Condition.visible);
    private SelenideElement fileSubmit = $(By.id("file-submit")).shouldBe(Condition.visible);
    private SelenideElement resultText = $(By.id("content")).shouldBe(Condition.visible);
    private SelenideElement dragDropUpload = $(By.id("drag-drop-upload")).shouldBe(Condition.visible);

    public void fileUpload(String fileName) {
        fileUpload.uploadFile(new File(BASE_FILE_DIR + "/" + fileName));
    }

    public void clickSubmit() {
        fileSubmit.click();
    }

    public String getResultText() {
        return resultText.getText();
    }
}
