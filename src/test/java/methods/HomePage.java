package methods;

import org.openqa.selenium.By;

public class HomePage extends BaseMethods{
    private By AUTHOR_LINK =By.cssSelector("li[class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-22853 menu-item-level0 wd-fly-menu'] a");
    private By JS_ALERT =By.xpath("//div[@id='popmake-536978']//button[@type='button']");
    private By PUBLISHER_LINK = By.xpath("//span[normalize-space()='প্রকাশক']");
    private By LOGIN= By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    private By BLOG_LINK =By.xpath("//span[contains(text(),'ব্লগ')]");

    public void authorLinkClick(){
        clickOnElement(AUTHOR_LINK);
    }
    public void homePopUp(){
        clickOnElement(JS_ALERT);
    }
    public void publisherLinkClick(){
        clickOnElement(PUBLISHER_LINK);
    }
    public void loginLink(){
        clickOnElement(LOGIN);
    }
    public void blogLink(){
        clickOnElement(BLOG_LINK);
    }

}
