package webtests;

import methods.*;
import org.testng.annotations.Test;
import utilities.DriverSetUp;

public class WishlistTest extends DriverSetUp {
    HomePage homepage;
    AuthorPage author;
    BaseMethods base;
    WishListPage wishlist;
    Login login;
    @Test
    public void wishList() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        homepage = new HomePage();
        author = new AuthorPage();
        wishlist = new WishListPage();
        login= new Login();
        homepage.homePopUp();
        homepage.loginLink();
        login.loginCredential();
        homepage.authorLinkClick();
        author.authorName();
        author.authorBookDetails();
        wishlist.clickWishlist();
        wishlist.wishlistLink();
        Thread.sleep(3000);
    }
}
