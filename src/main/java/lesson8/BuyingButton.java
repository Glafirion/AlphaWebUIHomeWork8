package lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.$;

public class BuyingButton {

    private SelenideElement totalSumma = $(By.xpath("//div[@id='cart_total_cost']"));

    @Step("Check total summa in basket")

    public void checkTotalSumma(String expectedSumma) {
        totalSumma.shouldHave(Condition.text(expectedSumma));

    }


}
