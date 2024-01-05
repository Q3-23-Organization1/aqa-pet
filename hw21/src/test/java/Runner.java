import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import pages.Download;
import pages.DynamicLoading;
import pages.Upload;

import java.io.File;


import static org.assertj.core.api.Assertions.assertThat;

public class Runner {

    @Test
    void uploadFile() {
        Selenide.open("https://the-internet.herokuapp.com/upload");

        Upload upload = new Upload();
        upload.fileUpload("MyTest.TXT");
        upload.clickSubmit();

        assertThat(upload.getResultText()).isEqualTo("File Uploaded!\n" +
                "MyTest.TXT");
    }

    @Test
    void downloadsFiles() {
        Selenide.open("https://the-internet.herokuapp.com/download");

        Download download = new Download();
        SelenideElement selenideElement = download.findElement("MyTest.TXT");
        File downloadedFile = download.download(selenideElement);

        System.out.println("getText "+selenideElement.getText());

        assertThat(downloadedFile.getName()).matches("MyTest.*\\.TXT");
    }

    @Test
    void dynamicallyLoadedFirst() {
        Selenide.open("https://the-internet.herokuapp.com/dynamic_loading");

        DynamicLoading dynamicLoading = new DynamicLoading();
        dynamicLoading.getFirstExample().click();
        dynamicLoading.getStart().click();
        String finishText = dynamicLoading.getFinish().getText();

        assertThat(finishText.matches("Hello World!"));
    }


    @Test
    void dynamicallyLoadSecond() {
        Selenide.open("https://the-internet.herokuapp.com/dynamic_loading");

        DynamicLoading dynamicLoading = new DynamicLoading();
        dynamicLoading.getSecondExample().click();
        dynamicLoading.getStart().click();
        String finishText = dynamicLoading.getFinish().getText();

        assertThat(finishText.matches("Hello World!"));
    }
}
