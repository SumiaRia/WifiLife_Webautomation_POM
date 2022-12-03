package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static utilities.DriverSetUp.getDriver;

public class AuthorPage extends BaseMethods{
    private By NEXT_PAGE = By.xpath("//a[contains(text(),'→')]");
    private By BACK_PAGE_BY_LINK = By.cssSelector("a[href='/cat/books/author/']");
    private By AUTHOR_NAME = By.xpath("//h3[normalize-space()='Abdul Awal Mintu']");
    private By AUTHOR_BOOK_DETAILS= By.xpath("//div[@class='product_thumbnail_wrapper']//a");

    public void clickNextPage(){
        clickOnElement(NEXT_PAGE);
    }
    public void backPageByLink(){
        clickOnElement(BACK_PAGE_BY_LINK);
    }
    public void authorName(){
        clickOnElement(AUTHOR_NAME);
    }
    public void authorBookDetails(){
        clickOnElement(AUTHOR_BOOK_DETAILS);
    }



}
