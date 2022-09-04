package lesson7;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;

import static org.openqa.selenium.OutputType.BYTES;

public class AdditionalLogger implements WebDriverListener {
    private static Logger logger = LoggerFactory.getLogger(AdditionalLogger.class);

    public void beforeFindElement(WebDriver driver, By locator) {
        logger.info("Search element by locator" + locator);
        Allure.step("Search element by locator" + locator);
    }
    public void beforeQuit(WebDriver driver) {
        Allure.addAttachment("Screenshot before browser KILL",
                new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(BYTES)));
    }

}
