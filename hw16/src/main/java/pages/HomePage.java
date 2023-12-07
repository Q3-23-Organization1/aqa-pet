package pages;

import fragments.CookiesWindow;
import fragments.Header;
import fragments.SubscribeWindow;
import org.openqa.selenium.WebDriver;

public class HomePage{

    private WebDriver driver;
    private Header header;
    private SubscribeWindow subscribeWindow;
    private CookiesWindow cookiesWindow;


    public HomePage(WebDriver driver, Header header) {
        this.driver = driver;
        this.header = header;
    }

    public HomePage(WebDriver driver, SubscribeWindow subscribeWindow) {
        this.driver = driver;
        this.subscribeWindow = subscribeWindow;
    }

    public HomePage(WebDriver driver, CookiesWindow cookiesWindow) {
        this.driver = driver;
        this.cookiesWindow = cookiesWindow;
    }

    public String getChristmasFromHeader(){
        return header.getTextChristmas();
    }

    public String getTextBrandsFromHeader(){
        return header.getTextBrands();
    }
    public String getTextNewTrendingFromHeader(){
        return header.getTextNewTrending();
    }

    public String getTextSkinCareFromHeader(){
        return header.getTextSkinCare();
    }
    public void getClickSkinCareFromHeader(){
         header.getClickSkinCare();
    }

    public String getTextMakeUpFromHeader(){
        return header.getTextMakeUp();
    }
    public String getTextHairFromHeader(){
        return header.getTextHair();
    }

    public String getTextBodyFromHeader(){
        return header.getTextBody();
    }
    public String getTextWellbeingFromHeader(){
        return header.getTextWellbeing();
    }
    public String getTextFragranceFromHeader(){
        return header.getTextFragrance();
    }

    public String getTextMinisFromHeader(){
        return header.getTextMinis();
    }
    public String getTextOffersFromHeader(){
        return header.getTextOffers();
    }

    public String getTextCultConsciousFromHeader(){
        return header.getTextCultConscious();
    }

    public String getTextForHimFromHeader(){
        return header.getTextForHim();
    }
    public String getTextBlogFromHeader(){
        return header.getTextBlog();
    }


    public void getCloseFromSubscribeWindow(){
         subscribeWindow.getClickClose();
    }

    public void getSignUpFromSubscribeWindow(){
        subscribeWindow.getClickSignUp();
    }

    public String getTextErrorFromSubscribeWindow(){
        return subscribeWindow.getTextError();
    }

    public String getTextThatOkFromCookiesWindow(){
        return cookiesWindow.getTextThatOk();
    }

    public String getTextSetPreferencesFromCookiesWindow(){
        return cookiesWindow.getTextSetPreferences();
    }
    public void getClickThatOkFromCookiesWindow(){
        cookiesWindow.getClickThatOk();
    }
}

