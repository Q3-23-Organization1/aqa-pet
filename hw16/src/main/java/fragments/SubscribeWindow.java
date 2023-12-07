package fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscribeWindow {

    private WebDriver driver;

    public SubscribeWindow(WebDriver driver) {
        this.driver = driver;
    }
    private static final By CLOSE = By.xpath("//button[@class='sc-hjQCSK sc-bSakgD kOHbQn lfjxdt']");
    private static final By EMAIL = By.xpath("//input[@label='Email address']']");
    private static final By SIGN_UP = By.xpath("//button[@data-testid='button-submit-newletter-signup']");

    private static final By ERROR = By.xpath("//span[@id='email-address-error']");

    public void getClickClose(){
        driver.findElement(CLOSE).click();
    }


    public void getClickSignUp(){
        driver.findElement(SIGN_UP).click();
    }

    public String getTextError(){
        return driver.findElement(ERROR).getText();
    }


}
