package pages;

import fragments.ConfirmBagWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkinCarePage {
    private WebDriver driver;

    private ConfirmBagWindow confirmBagWindow;

    public SkinCarePage(WebDriver driver) {
        this.driver = driver;
    }

    public SkinCarePage(WebDriver driver,ConfirmBagWindow confirmBagWindow ) {
        this.driver = driver;
        this.confirmBagWindow = confirmBagWindow;
    }

    private static final By CHECK_BOX = By.xpath("//li[@class='sc-kJPuub eqUAAs']");
    private static final By CURRENT_FILTERS = By.xpath("//ul[@aria-label='Current filters']");
    private static final By PRODUCTS = By.xpath("//ul[@data-testid='product-list-page-product-list']");
    private static final By ADD_BASKET = By.xpath("//a[@class='sc-jfmDQi cFWPFL']");


    public void getClickCheckBox(){
         driver.findElement(CHECK_BOX).click();
    }
    public void getClickAddBasket(){
        driver.findElement(ADD_BASKET).click();
    }

    public String getTextCurrentFilters(){
        return driver.findElement(CURRENT_FILTERS).getText();
    }

    public String getTextProduct(){
         return driver.findElement(PRODUCTS).getText();
    }

    public void getClickCloseFromConfirmBag(){
        confirmBagWindow.getClickCloseConfirmM();
    }
    public void getClickAddBasketFromConfirmBag(){
        confirmBagWindow.getClickAddBasketConfirm();
    }
}

