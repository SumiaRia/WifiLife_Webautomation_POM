package methods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetUp.getDriver;

public class BaseMethods {
    public WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public void writeText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }
    public void quickKeys(By locator){
        getElement(locator).sendKeys(Keys.ENTER);
    }

    public String getAlertText() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
    public void javaScriptClick(By locator){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", locator);



    }

}
