package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.$;

public class MainMenuBlock {

    private SelenideElement fifteenBookButton = $(By.xpath("//div[3]//a[1]//div[1]"));

    @Step("Choose icon 15 famous book")

    public void clickFifteenBookButton() {
        fifteenBookButton.click();

    }
}
