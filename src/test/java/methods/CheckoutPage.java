package methods;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

import static utilities.DriverSetUp.getDriver;

public class CheckoutPage extends BaseMethods{
    private By NAME = By.id("billing_first_name");
    private By PHONE_NUM = By.id("billing_phone");
    private By URGENT_NUM = By.id("billing_alternative_phone");
    private By EMAIL= By.id("billing_email");
    private By DISTRICT = By.id("select2-billing_state-container");
    private By AUTO_SUGGESTION_DROPDOWN_DISTRICT= By.xpath("//input[@role='combobox']");
    private By AREA = By.xpath("//select[@id='billing_area']");
    private By ADDRESS = By.id("billing_address_1");
    private By INFORMATION = By.id("order_comments");
    private By CHECK_SHIPPING_ADDRESS =By.id("ship-to-different-address-checkbox");
    private By SHIPPING_NAME =By.id("shipping_first_name");
    private By SHIPPING_PHONE_NUM =By.id("shipping_phone");
    private By SHIPPING_URGENT_NUM =By.id("shipping_alternative_phone");
    private By SHIPPING_EMAIL=By.id("shipping_email");
    private By SHIPPING_DISTRICT =By.id("select2-shipping_state-container");
    private By SHIPPING_AUTO_SUGGESTION_DROPDOWN_DISTRICT = By.xpath("//input[@role='combobox']");
    private By SHIPPING_AREA =By.id("shipping_area");
    private By SHIPPING_ADDRESS =By.id("shipping_address_1");
     public By  PAYMENT_METHOD =By.cssSelector("#payment_method_bkash");
    JavascriptExecutor js = (JavascriptExecutor) getDriver();


    public void checkoutForm(String name, String number, String urg_num, String email, String district, String area, String address, String info) throws InterruptedException {
        writeText(NAME, name);
        writeText(PHONE_NUM, number);
        writeText(URGENT_NUM, urg_num);
        writeText(EMAIL, email);
        clickOnElement(DISTRICT);
        writeText(AUTO_SUGGESTION_DROPDOWN_DISTRICT,district);
        quickKeys(AUTO_SUGGESTION_DROPDOWN_DISTRICT);
        Thread.sleep(3000);
        Select sel_area = new Select(getElement(AREA));
        sel_area.selectByValue(area);
        writeText(ADDRESS, address);
        writeText(INFORMATION, info);
    }
    public void paymentMethod(){
//        javaScriptClick(PAYMENT_METHOD);
      clickOnElement(PAYMENT_METHOD);
    }

    public void checkoutShippingForm(String name, String number, String urg_num, String email, String district, String area, String address) throws InterruptedException {
        clickOnElement(CHECK_SHIPPING_ADDRESS);
        writeText(SHIPPING_NAME, name);
        writeText(SHIPPING_PHONE_NUM, number);
        writeText(SHIPPING_URGENT_NUM, urg_num);
        writeText(SHIPPING_EMAIL, email);
        clickOnElement(SHIPPING_DISTRICT);
        writeText(SHIPPING_AUTO_SUGGESTION_DROPDOWN_DISTRICT,district);
        quickKeys(SHIPPING_AUTO_SUGGESTION_DROPDOWN_DISTRICT);
        Thread.sleep(3000);
        Select sel_area = new Select(getElement(SHIPPING_AREA));
        sel_area.selectByValue(area);
        writeText(SHIPPING_ADDRESS, address);
    }



}
