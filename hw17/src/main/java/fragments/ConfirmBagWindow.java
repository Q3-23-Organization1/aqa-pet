package fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBagWindow {
    private WebDriver driver;

    public ConfirmBagWindow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='sc-jfmDQi cFWPFL']")
    private WebElement addBasketConfirm;

    @FindBy(xpath = "//button[@data-testid='added-to-basket-modal-close-button']")
    private WebElement closeConfirm;

    public void getClickAddBasketConfirm() {

        addBasketConfirm.click();
    }

    public void getClickCloseConfirm() {
        closeConfirm.click();
    }
}