import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    ChromeOptions options ;
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10
                , TimeUnit.SECONDS);
        driver.get("https://www.cultbeauty.com/");
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
