import fragments.ConfirmBagWindow;
import fragments.CookiesWindow;
import fragments.Header;
import fragments.SubscribeWindow;
import org.testng.annotations.*;
import pages.BagPage;
import pages.HomePage;
import pages.SkinCarePage;

import static org.assertj.core.api.Assertions.assertThat;


public class HomePageTests extends BaseTest{

   private HomePage homePage;
    private HomePage homePageSubWindow;
    private HomePage homePageCookiesWindow;
    private SkinCarePage skinCarePage;

    private SkinCarePage skinCareConfirmBag;

    private BagPage bagPage;


    @BeforeMethod
    public void initCookiesWindow(){
        CookiesWindow cookiesWindow = new CookiesWindow(driver);
        homePageCookiesWindow = new HomePage(driver, cookiesWindow);
    }

    @Test(priority = 1)
    public void cookiesWindowTest(){
        assertThat(homePageCookiesWindow.getTextThatOkFromCookiesWindow().equals("That's OK"));
        assertThat(homePageCookiesWindow.getTextSetPreferencesFromCookiesWindow().equals("Set Preferences"));

        homePageCookiesWindow.getClickThatOkFromCookiesWindow();
    }

    @BeforeMethod
    public void initSubWindow(){
        SubscribeWindow subscribeWindow = new SubscribeWindow(driver);
        homePageSubWindow = new HomePage(driver, subscribeWindow);
    }

    @Test(priority = 2)
    public void subscribeWindowTest(){
        homePageSubWindow.getSignUpFromSubscribeWindow();
        assertThat(homePageSubWindow.getTextErrorFromSubscribeWindow().equals("Email address is a required field"));

        homePageSubWindow.getCloseFromSubscribeWindow();
    }

    @BeforeMethod
    public void initHeader(){
        Header header = new Header(driver);
        homePage = new HomePage(driver, header);
    }
    @Test(priority = 3)
    public void headerTest(){
        assertThat(homePage.getChristmasFromHeader().equals("Christmas"));
        assertThat(homePage.getTextBrandsFromHeader().equals("Brands"));
        assertThat(homePage.getTextNewTrendingFromHeader().equals("New & Trending"));
        assertThat(homePage.getTextSkinCareFromHeader().equals("Skin Care"));
        assertThat(homePage.getTextMakeUpFromHeader().equals("Make Up"));
        assertThat(homePage.getTextHairFromHeader().equals("Hair"));
        assertThat(homePage.getTextBodyFromHeader().equals("Body"));
        assertThat(homePage.getTextWellbeingFromHeader().equals("Wellbeing"));
        assertThat(homePage.getTextFragranceFromHeader().equals("Fragrance"));
        assertThat(homePage.getTextMinisFromHeader().equals("Minis"));
        assertThat(homePage.getTextOffersFromHeader().equals("Offers"));
        assertThat(homePage.getTextCultConsciousFromHeader().equals("Cult Conscious"));
        assertThat(homePage.getTextForHimFromHeader().equals("For Him"));
        assertThat(homePage.getTextBlogFromHeader().equals("Blog"));
    }

    @BeforeMethod
    public void initSkinCare(){
        ConfirmBagWindow confirmBagWindow = new ConfirmBagWindow(driver);
        skinCarePage = new SkinCarePage(driver);
        skinCareConfirmBag = new SkinCarePage(driver, confirmBagWindow);
    }
    @Test(priority = 4)
    public void SkinCareTest(){
        homePage.getClickSkinCareFromHeader();

        skinCarePage.getClickCheckBox();
        assertThat(skinCarePage.getTextCurrentFilters().contains("Brand:111SKIN"));
        assertThat(skinCarePage.getTextProduct().contains("111SKIN"));

        skinCarePage.getClickAddBasket();
        skinCareConfirmBag.getClickAddBasketFromConfirmBag();
        skinCareConfirmBag.getClickCloseFromConfirmBag();
    }

    @BeforeMethod
    public void initBag(){
        bagPage = new BagPage(driver);
    }
    @Test(priority = 5)
    public void bagTest(){
        bagPage.getClickViewBag();

        assertThat(bagPage.getTextBasketItemsTable().contains("111SKIN Repair Night Cream 50ml"));

        bagPage.getClickRemove();
        assertThat(bagPage.getTextBasketItemsTable().contains("Your bag looks empty"));
    }
}
