package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagPage {
    private WebDriver driver;

    public BagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/my.basket']")
    private WebElement viewBag;

    @FindBy(xpath = "//main[@id='main-content']")
    private WebElement basket;

    @FindBy(xpath = "//button[@aria-label='Remove item']")
    private WebElement remove;


    public void getClickViewBag() {
        viewBag.click();
    }

    public void getClickRemove() {
        remove.click();
    }

    public String getTextBasketItemsTable() {
        return basket.getText();
    }
}

