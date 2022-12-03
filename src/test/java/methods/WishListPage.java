package methods;

import org.openqa.selenium.By;

public class WishListPage extends BaseMethods{
    private By ADD_WISHLIST = By.xpath("//span[@class='tinvwl_add_to_wishlist-text']");
    private By WISHLIST_LINK = By.xpath("//a[contains(text(),'উইশ লিস্ট')]");
    public void clickWishlist(){
        clickOnElement(ADD_WISHLIST);
    }
    public void wishlistLink(){
        clickOnElement(WISHLIST_LINK);
    }
}
