package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Download {

    private final ElementsCollection downloadPageElements = $$(By.xpath("//*[@id=\"content\"]/div/a"));

    public SelenideElement findElement(String expectedText) {
        return downloadPageElements.findBy(text(expectedText));
    }

    public File download(SelenideElement expectedElement) {
        return expectedElement.download();
    }
}