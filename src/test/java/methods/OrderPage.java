package methods;

import org.openqa.selenium.By;

public class OrderPage extends BaseMethods{
    private By CLICK_ORDER_KORUN = By.xpath("//div[@class='body-wrapper']//button[2]");
    private By BUTTON_CHECKOUT = By.xpath("//a[@title='checkout']");

    public void clickOrderKorun(){
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].click();",CLICK_ORDER_KORUN);
        clickOnElement(CLICK_ORDER_KORUN);
    }
    public void buttonCheckout(){
        clickOnElement(BUTTON_CHECKOUT);
    }
}
