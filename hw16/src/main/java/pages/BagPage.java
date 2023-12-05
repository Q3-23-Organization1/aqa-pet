package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BagPage {
    private WebDriver driver;

    public BagPage(WebDriver driver) {
        this.driver = driver;
    }


    private static final By VIEW_BAG = By.xpath("//a[@href='/my.basket']");
    private static final By BASKET = By.xpath("//main[@id='main-content']");
    private static final By REMOVE = By.xpath("//button[@aria-label='Remove item']");


    public void getClickViewBag(){
        driver.findElement(VIEW_BAG).click();
    }
    public void getClickRemove(){
        driver.findElement(REMOVE).click();
    }
    public String getTextBasketItemsTable(){
       return driver.findElement(BASKET).getText();
    }
}

