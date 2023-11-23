import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Runner {

    WebDriver driver = new ChromeDriver();

    @Test(description = "Login test positive")
    public void loginTestPositive(){
        driver.get("https://the-internet.herokuapp.com/login ");

        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement login = driver.findElement(By.xpath("//*[@id='login']/button"));

        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        login.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement text = driver.findElement(By.xpath("//*[@id='flash']"));
        Assert.assertEquals(text.getText(), "You logged into a secure area!\n" +"×");

    }

    @Test(description = "Login test negative")
    public void loginTestNegative(){
        driver.get("https://the-internet.herokuapp.com/login ");

        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));

        username.sendKeys("test");
        password.sendKeys("test");
        login.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement text = driver.findElement(By.xpath("//*[@id='flash']"));
        Assert.assertEquals(text.getText(), "Your username is invalid!\n" +"×");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
