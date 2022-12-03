package webtests;

import methods.BlogPage;
import methods.HomePage;
import org.testng.annotations.Test;
import utilities.DriverSetUp;
import utilities.WindowHandles;

import java.util.Iterator;
import java.util.Set;

public class BlogTest extends DriverSetUp {
    HomePage homepage;
    BlogPage blog;
    WindowHandles handles;
    @Test
    public void blogTest() throws InterruptedException {
        getDriver().get("https://www.wafilife.com/");
        homepage = new HomePage();
        blog = new BlogPage();
        handles= new WindowHandles();
        homepage.homePopUp();
        homepage.blogLink();
        handles.getWindowHandles();
        blog.clickSubject();
        blog.clickReadMore();
        Thread.sleep(3000);
    }

}
