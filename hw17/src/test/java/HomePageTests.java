import fragments.ConfirmBagWindow;
import fragments.CookiesWindow;
import fragments.SubscribeWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.BagPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.SkinCarePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;


public class HomePageTests {
    ChromeOptions options;
    private WebDriver driver;
    private HeaderPage header;
    private HomePage homePageSubWindow;
    private HomePage homePageCookiesWindow;
    private SkinCarePage skinCarePage;
    private SkinCarePage skinCareConfirmBag;
    private BagPage bagPage;

    @BeforeClass
    public void setUp() {
        options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
        driver.get("https://www.cultbeauty.com/");

        CookiesWindow cookiesWindow = new CookiesWindow(driver);
        homePageCookiesWindow = new HomePage(driver, cookiesWindow);

        SubscribeWindow subscribeWindow = new SubscribeWindow(driver);
        homePageSubWindow = new HomePage(driver, subscribeWindow);

        header = new HeaderPage(driver);

        ConfirmBagWindow confirmBagWindow = new ConfirmBagWindow(driver);
        skinCarePage = new SkinCarePage(driver);
        skinCareConfirmBag = new SkinCarePage(driver, confirmBagWindow);

        bagPage = new BagPage(driver);
    }


    @Test(priority = 1)
    public void cookiesWindowTest() {
        assertThat(homePageCookiesWindow.getTextThatOkFromCookiesWindow().equals("That's OK"));
        assertThat(homePageCookiesWindow.getTextSetPreferencesFromCookiesWindow().equals("Set Preferences"));

        homePageCookiesWindow.getClickThatOkFromCookiesWindow();
    }


    @Test(priority = 2)
    public void subscribeWindowTest() {
        homePageSubWindow.getSignUpFromSubscribeWindow();
        assertThat(homePageSubWindow.getTextErrorFromSubscribeWindow().equals("Email address is a required field"));

        homePageSubWindow.getCloseFromSubscribeWindow();
    }

    @Test(priority = 3)
    public void headerTest() {
        assertThat(header.getTextChristmas().equals("Christmas"));
        assertThat(header.getTextBrands().equals("Brands"));
        assertThat(header.getTextNewTrending().equals("New & Trending"));
        assertThat(header.getTextSkinCare().equals("Skin Care"));
        assertThat(header.getTextMakeUp().equals("Make Up"));
        assertThat(header.getTextHair().equals("Hair"));
        assertThat(header.getTextBody().equals("Body"));
        assertThat(header.getTextWellbeing().equals("Wellbeing"));
        assertThat(header.getTextFragrance().equals("Fragrance"));
        assertThat(header.getTextMinis().equals("Minis"));
        assertThat(header.getTextOffers().equals("Offers"));
        assertThat(header.getTextCultConscious().equals("Cult Conscious"));
        assertThat(header.getTextForHim().equals("For Him"));
        assertThat(header.getTextBlog().equals("Blog"));
    }


    @Test(priority = 4)
    public void SkinCareTest() {
        header.getClickSkinCare();

        skinCarePage.getClickCheckBox();
        assertThat(skinCarePage.getTextCurrentFilters().contains("Brand:111SKIN"));
        assertThat(skinCarePage.getTextProduct().contains("111SKIN"));

        skinCarePage.getClickAddBasket();
        skinCareConfirmBag.getClickAddBasketFromConfirmBag();
        skinCareConfirmBag.getClickCloseFromConfirmBag();
    }

    @Test(priority = 5)
    public void bagTest() {
        bagPage.getClickViewBag();

        assertThat(bagPage.getTextBasketItemsTable().contains("111SKIN Repair Night Cream 50ml"));

        bagPage.getClickRemove();
        assertThat(bagPage.getTextBasketItemsTable().contains("Your bag looks empty"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
