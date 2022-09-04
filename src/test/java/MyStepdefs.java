import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson8.*;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("User on site")
    public void userOnSite() {
        open("https://www.moscowbooks.ru/");
    }

    @When("^Click on Articles Button$")
    public void clickOnArticlesButton() {
        new MainPage().clickArticlesButton();
    }

    @And("^Click on fifteen actual book icon$")
    public void clickOnFifteenActualBookIcon() {
        new MainMenuBlock().clickFifteenBookButton();
    }

    @And("^Click on first card book in list$")
    public void clickOnFirstCardBookInList() {
        new NovaPage().clickFirstCardBook();
    }

    @And("^Click buy button$")
    public void clickBuyButton() {
        new FirstCardBook().clickBuyBookButton();
    }

    @And("^Click basket icon button$")
    public void clickBasketIconButton() {
        new BuyBookButton().clickBasketButton();
    }

    @Then("^Check total summa$")
    public void checkTotalSumma() {
        new BuyingButton().checkTotalSumma("1 054");
    }


}



///       open("https://www.moscowbooks.ru/");
//    }
//
//    @When("^Click on Articles Button$")
//    public void clickOnArticlesButton() {
//        new MainPage().clickArticlesButton();
//    }
//
//    @And("^Click on fifteen actual book icon$")
//    public void clickOnFifteenActualBookIcon() {
//        new MainMenuBlock().clickFifteenBookButton();
//    }
//
//    @And("^Click on first card book in list$")
//    public void clickOnFirstCardBookInList() {
//        new NovaPage().clickFirstCardBook();
//    }
//
//    @And("^Click buy button$")
//    public void clickBuyButton() {
//        new FirstCardBook().clickBuyBookButton();
//    }
//
//    @And("^Click basket icon button$")
//    public void clickBasketIconButton() {
//        new BuyBookButton().clickBasketButton();
//    }
//
//    @Then("^Check total summa$")
//    public void checkTotalSumma() {
//        new BuyingButton().checkTotalSumma("1 054");