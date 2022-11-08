package methods;

import org.openqa.selenium.By;

public class HomePage extends BaseMethods{
    private By AUTHOR_LINK =By.cssSelector("li[class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-22853 menu-item-level0 wd-fly-menu'] a");
    private By JS_ALERT =By.xpath("//div[@id='popmake-526384']//button[@type='button']");

    public void authorLinkClick(){
        clickOnElement(AUTHOR_LINK);
    }
    public void homePopUp(){
        clickOnElement(JS_ALERT);
    }


}
