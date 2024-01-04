package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DynamicLoading {

    private SelenideElement firstExample = $(By.xpath("//*[@id=\"content\"]/div/a[1]"));
    private SelenideElement secondExample = $(By.xpath("//*[@id=\"content\"]/div/a[2]"));
    private SelenideElement start = $(By.xpath("//*[@id=\"start\"]/button"));
    private SelenideElement finish = $(By.id("finish"));

    public SelenideElement getFirstExample() {
        return firstExample.shouldBe(Condition.visible);
    }

    public SelenideElement getSecondExample() {
        return secondExample.shouldBe(Condition.visible);
    }

    public SelenideElement getStart() {
        return start.shouldBe(Condition.visible);
    }

    public SelenideElement getFinish() {
        return finish.shouldBe(Condition.visible, Duration.ofSeconds(25));
    }
}
