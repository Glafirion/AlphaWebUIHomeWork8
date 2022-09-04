package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.$;


public class MainPage  {
   private SelenideElement articlesButton =
                    $(By.xpath("//a[@class='features__icon icon-tdmosrecom']"));

    public MainMenuBlock mainMenuBlock;

    @Step("Click on articles icon")

    public void clickArticlesButton() {
        articlesButton.click();

    }

}



