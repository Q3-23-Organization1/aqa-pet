package pages;

import fragments.ConfirmBagWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkinCarePage {
    private WebDriver driver;

    public SkinCarePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private ConfirmBagWindow confirmBagWindow;


    public SkinCarePage(WebDriver driver, ConfirmBagWindow confirmBagWindow) {
        this.driver = driver;
        this.confirmBagWindow = confirmBagWindow;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='sc-gKsSvo gWYwgK']")
    private WebElement checkBox;
    @FindBy(xpath = "//ul[@aria-label='Current filters']")
    private WebElement currentFilters;
    @FindBy(xpath = "//ul[@data-testid='product-list-page-product-list']")
    private WebElement products;
    @FindBy(xpath = "//a[@class='sc-jfmDQi cFWPFL']")
    private WebElement addBasket;


    public void getClickCheckBox() {
        checkBox.click();
    }

    public void getClickAddBasket() {
        addBasket.click();
    }

    public String getTextCurrentFilters() {
        return currentFilters.getText();
    }

    public String getTextProduct() {
        return products.getText();
    }

    public void getClickCloseFromConfirmBag() {
        confirmBagWindow.getClickCloseConfirm();
    }

    public void getClickAddBasketFromConfirmBag() {
        confirmBagWindow.getClickAddBasketConfirm();
    }
}

