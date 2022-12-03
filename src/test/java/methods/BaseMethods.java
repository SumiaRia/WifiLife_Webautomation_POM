package methods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.window;
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
    public static void javaScriptScrollPageDown(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)", new Object[0]);
    }
    public void javaScriptClick(By locator){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", locator);
    }
    public static void javaScriptSrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public static void javaScriptClickElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

}
