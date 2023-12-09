package pages;

import fragments.CookiesWindow;
import fragments.SubscribeWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private SubscribeWindow subscribeWindow;
    private CookiesWindow cookiesWindow;

    private WebDriver driver;

    public HomePage(WebDriver driver, SubscribeWindow subscribeWindow) {
        this.driver = driver;
        this.subscribeWindow = subscribeWindow;
        PageFactory.initElements(driver, this);
    }

    public HomePage(WebDriver driver, CookiesWindow cookiesWindow) {
        this.driver = driver;
        this.cookiesWindow = cookiesWindow;
        PageFactory.initElements(driver, this);
    }

    public void getCloseFromSubscribeWindow() {
        subscribeWindow.getClickClose();
    }

    public void getSignUpFromSubscribeWindow() {
        subscribeWindow.getClickSignUp();
    }

    public String getTextErrorFromSubscribeWindow() {
        return subscribeWindow.getTextError();
    }

    public String getTextThatOkFromCookiesWindow() {
        return cookiesWindow.getTextThatOk();
    }

    public String getTextSetPreferencesFromCookiesWindow() {
        return cookiesWindow.getTextSetPreferences();
    }

    public void getClickThatOkFromCookiesWindow() {
        cookiesWindow.getClickThatOk();
    }
}

