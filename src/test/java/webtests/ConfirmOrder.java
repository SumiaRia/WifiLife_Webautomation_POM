package webtests;

import methods.AuthorPage;
import methods.CheckoutPage;
import methods.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetUp;


public class ConfirmOrder extends DriverSetUp {
     HomePage homepage;
     AuthorPage author;
     CheckoutPage checkout;

     @Test
    public void selectAuthor() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        homepage = new HomePage();
        author = new AuthorPage();
        checkout = new CheckoutPage();
        homepage.homePopUp();
        homepage.authorLinkClick();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        author.clickNextPage();
        author.backPageByLink();
        author.authorName();
        author.authorBookDetails();
        author.clickOrderKorun();
        author.buttonCheckout();
        checkout.checkoutForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road","abkdhfierj");
        checkout.paymentMethod();
    }
    @Test
    public void selectAuthorWithShipping() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        homepage = new HomePage();
        author = new AuthorPage();
        checkout = new CheckoutPage();
        homepage.homePopUp();
        homepage.authorLinkClick();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        author.clickNextPage();
        author.backPageByLink();
        author.authorName();
        author.authorBookDetails();
        author.clickOrderKorun();
        author.buttonCheckout();
        checkout.checkoutForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road","abkdhfierj");
        checkout.checkoutShippingForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road");
        WebElement Element = getDriver().findElement(By.id("payment_method_bkash"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("arguments[0].click()", Element);
    }



}
