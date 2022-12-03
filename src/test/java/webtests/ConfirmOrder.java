package webtests;

import methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetUp;


public class ConfirmOrder extends DriverSetUp {
     HomePage homepage;
     AuthorPage author;
     CheckoutPage checkout;
     BaseMethods base;
     PublisherPage publisher;
     OrderPage order;

     @Test
    public void selectAuthor() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        String title = getDriver().getTitle();
        Assert.assertEquals("Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife",title,"Title is matched");
        homepage = new HomePage();
        author = new AuthorPage();
        checkout = new CheckoutPage();
        base = new BaseMethods();
        order = new OrderPage();
        homepage.homePopUp();
        homepage.authorLinkClick();
        base.javaScriptScrollPageDown();
        author.clickNextPage();
        author.backPageByLink();
        author.authorName();
        author.authorBookDetails();
        order.clickOrderKorun();
        order.buttonCheckout();
        checkout.checkoutForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road","abkdhfierj");
        checkout.paymentMethod();
    }
    @Test
    public void selectAuthorWithShipping() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        homepage = new HomePage();
        author = new AuthorPage();
        checkout = new CheckoutPage();
        base = new BaseMethods();
        order = new OrderPage();
        homepage.homePopUp();
        homepage.authorLinkClick();
        base.javaScriptScrollPageDown();
        author.clickNextPage();
        author.backPageByLink();
        author.authorName();
        author.authorBookDetails();
        order.clickOrderKorun();
        order.buttonCheckout();
        checkout.checkoutForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road","abkdhfierj");
        checkout.checkoutShippingForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road");
        WebElement Element = getDriver().findElement(By.id("payment_method_bkash"));
        base.javaScriptSrollIntoView(Element);
        base.javaScriptClickElement(Element);
    }
    @Test
    public void selectPublish() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        homepage = new HomePage();
        publisher = new PublisherPage();
        checkout = new CheckoutPage();
        order = new OrderPage();
        homepage.homePopUp();
        homepage.publisherLinkClick();
        publisher.publisherSearchForName();
        publisher.clickPublisherName();
        publisher.clickSubject();
        publisher.clickBook();
        order.clickOrderKorun();
        order.buttonCheckout();
        checkout.checkoutForm("nezuko","01635208881","01635208881","a@gmail.com","Cumilla","15","10,road","abkdhfierj");
        checkout.paymentMethod();

    }

}
