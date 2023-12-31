package fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesWindow {

    private WebDriver driver;

    public CookiesWindow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='sc-jfmDQi cFWPFL']")
    private WebElement setPreferences;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement thatOk;


    public void getClickThatOk() {
        thatOk.click();
    }

    public String getTextSetPreferences() {
        return setPreferences.getText();
    }

    public String getTextThatOk() {
        return thatOk.getText();
    }
}
