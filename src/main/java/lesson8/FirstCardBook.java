package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class FirstCardBook {

    private SelenideElement buyBookButton =
            $(By.xpath("//a[@class='tocart_btn book__buy-button button button_lg']"));

    @Step("Click buy button")
    public void clickBuyBookButton() {
        buyBookButton.click();
    }

}


