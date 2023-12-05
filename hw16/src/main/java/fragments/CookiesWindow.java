package fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesWindow {


    private static final By SET_PREFERENCES  = By.xpath("//button[@id='onetrust-pc-btn-handler']");
    private static final By THAT_OK = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    private WebDriver driver;

    public CookiesWindow(WebDriver driver) {
        this.driver = driver;
    }
    public void getClickThatOk(){
        driver.findElement(THAT_OK).click();
    }

    public String getTextSetPreferences(){
        return driver.findElement(SET_PREFERENCES).getText();
    }

    public String getTextThatOk(){
        return driver.findElement(THAT_OK).getText();
    }
}
