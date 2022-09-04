package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.$;

public class NovaPage {

    private SelenideElement firstCardBook =
            $(By.xpath("//img[@alt='Читая Лолиту в Тегеране, Нафиси А. обложка-превью']"));

    @Step("Choose first card book")

    public void clickFirstCardBook() {
        firstCardBook.click();

    }
}


