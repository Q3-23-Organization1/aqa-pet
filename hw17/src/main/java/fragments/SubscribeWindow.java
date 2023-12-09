package fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeWindow {

    private WebDriver driver;

    public SubscribeWindow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='sc-hjQCSK sc-bSakgD kOHbQn lfjxdt']")
    private WebElement close;
    @FindBy(xpath = "//input[@label='Email address']']")
    private WebElement email;
    @FindBy(xpath = "//button[@data-testid='button-submit-newletter-signup']")
    private WebElement signUp;

    @FindBy(xpath = "//span[@id='email-address-error']")
    private WebElement error;

    public void getClickClose() {
        close.click();
    }


    public void getClickSignUp() {
        signUp.click();
    }

    public String getTextError() {
        return error.getText();
    }


}
