package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class BuyBookButton {

    private SelenideElement basketButton = $(By.xpath("//a[@class='header__main__basket__block']"));

    @Step("Basket icon click")

    public void clickBasketButton() {
        basketButton.click();

    }
}
