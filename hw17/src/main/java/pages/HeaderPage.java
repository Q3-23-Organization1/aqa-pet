package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    private WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-testid='navigation-link-0']")
    private WebElement christmas;

    @FindBy(xpath = "//a[@data-testid='navigation-link-1']")
    private WebElement brands;

    @FindBy(xpath = "//a[@data-testid='navigation-link-2']")
    private WebElement newTrending;

    @FindBy(xpath = "//a[@data-testid='navigation-link-3']")
    private WebElement skinCare;

    @FindBy(xpath = "//a[@data-testid='navigation-link-4']")
    private WebElement makeUp;

    @FindBy(xpath = "//a[@data-testid='navigation-link-5']")
    private WebElement hair;

    @FindBy(xpath = "//a[@data-testid='navigation-link-6']")
    private WebElement body;

    @FindBy(xpath = "//a[@data-testid='navigation-link-7']")
    private WebElement wellbeing;

    @FindBy(xpath = "//a[@data-testid='navigation-link-8']")
    private WebElement fragrance;

    @FindBy(xpath = "//a[@data-testid='navigation-link-9']")
    private WebElement minis;
    @FindBy(xpath = "//a[@data-testid='navigation-link-10']")
    private WebElement offers;
    @FindBy(xpath = "//a[@data-testid='navigation-link-11']")
    private WebElement cultConscious;
    @FindBy(xpath = "//a[@data-testid='navigation-link-12']")
    private WebElement forHim;
    @FindBy(xpath = "//a[@data-testid='navigation-link-12']")
    private WebElement blog;


    public String getTextChristmas() {
        return christmas.getText();
    }

    public void getClickChristmas() {
        christmas.click();
    }

    public String getTextBrands() {
        return brands.getText();
    }

    public void getClickBrands() {
        brands.click();
    }

    public String getTextNewTrending() {
        return newTrending.getText();
    }

    public void getClickNewTrending() {
        newTrending.click();
    }

    public String getTextSkinCare() {
        return skinCare.getText();
    }

    public void getClickSkinCare() {
        skinCare.click();
    }

    public String getTextMakeUp() {
        return makeUp.getText();
    }

    public String getTextHair() {
        return hair.getText();
    }

    public String getTextBody() {
        return body.getText();
    }

    public void getClickBody() {
        body.click();
    }

    public String getTextWellbeing() {
        return wellbeing.getText();
    }

    public String getTextFragrance() {
        return fragrance.getText();
    }

    public String getTextMinis() {
        return minis.getText();
    }

    public String getTextOffers() {
        return offers.getText();
    }

    public String getTextCultConscious() {
        return cultConscious.getText();
    }

    public String getTextForHim() {
        return forHim.getText();
    }

    public String getTextBlog() {
        return blog.getText();
    }
}