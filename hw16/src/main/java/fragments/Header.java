package fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

    private static final By CHRISTMAS = By.xpath("//a[@data-testid='navigation-link-0']");
    private static final By BRANDS = By.xpath("//a[@data-testid='navigation-link-1']");
    private static final By NEW_TRENDING = By.xpath("//a[@data-testid='navigation-link-2']");
    private static final By SKIN_CARE = By.xpath("//a[@data-testid='navigation-link-3']");
    private static final By MAKE_UP = By.xpath("//a[@data-testid='navigation-link-4']");
    private static final By HAIR = By.xpath("//a[@data-testid='navigation-link-5']");
    private static final By BODY = By.xpath("//a[@data-testid='navigation-link-6']");
    private static final By WELLBEING = By.xpath("//a[@data-testid='navigation-link-7']");
    private static final By FRAGRANCE = By.xpath("//a[@data-testid='navigation-link-8']");
    private static final By MINIS = By.xpath("//a[@data-testid='navigation-link-9']");
    private static final By OFFERS = By.xpath("//a[@data-testid='navigation-link-10']");
    private static final By CULT_CONSCIOUS = By.xpath("//a[@data-testid='navigation-link-11']");
    private static final By FOR_HIM = By.xpath("//a[@data-testid='navigation-link-12']");
    private static final By BLOG = By.xpath("//a[@data-testid='navigation-link-13']");
    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextChristmas(){
        return driver.findElement(CHRISTMAS).getText();
    }

    public void getClickChristmas(){
        driver.findElement(CHRISTMAS).click();
    }

    public String getTextBrands(){
        return driver.findElement(BRANDS).getText();
    }

    public void getClickBrands(){
        driver.findElement(BRANDS).click();
    }

    public String getTextNewTrending(){
        return driver.findElement(NEW_TRENDING).getText();
    }

    public void getClickNewTrending(){
        driver.findElement(NEW_TRENDING).click();
    }

    public String getTextSkinCare(){
        return driver.findElement(SKIN_CARE).getText();
    }

    public void getClickSkinCare(){
        driver.findElement(SKIN_CARE).click();
    }

    public String getTextMakeUp(){
        return driver.findElement(MAKE_UP).getText();
    }

    public String getTextHair(){
        return driver.findElement(HAIR).getText();
    }

    public String getTextBody(){
        return driver.findElement(BODY).getText();
    }

    public void getClickBody(){
        driver.findElement(BODY).click();
    }

    public String getTextWellbeing(){
        return driver.findElement(WELLBEING).getText();
    }

    public String getTextFragrance(){
        return driver.findElement(FRAGRANCE).getText();
    }

    public String getTextMinis(){
        return driver.findElement(MINIS).getText();
    }

    public String getTextOffers(){
        return driver.findElement(OFFERS).getText();
    }

    public String getTextCultConscious(){
        return driver.findElement(CULT_CONSCIOUS).getText();
    }

    public String getTextForHim(){
        return driver.findElement(FOR_HIM).getText();
    }

    public String getTextBlog(){
        return driver.findElement(BLOG).getText();
    }
}