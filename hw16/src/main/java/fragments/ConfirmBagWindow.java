package fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmBagWindow {

    private WebDriver driver;

    public ConfirmBagWindow(WebDriver driver) {
        this.driver = driver;
    }

    private static final By ADD_BASKET_CONFIRM = By.xpath("//button[@class='sc-jfmDQi cFWPFL']");
    private static final By CLOSE_CONFIRM = By.xpath("//button[@data-testid='added-to-basket-modal-close-button']");

    public void getClickAddBasketConfirm(){
        driver.findElement(ADD_BASKET_CONFIRM).click();
    }
    public void getClickCloseConfirmM(){
        driver.findElement(CLOSE_CONFIRM).click();
    }
}
