package methods;

import org.openqa.selenium.By;

public class PublisherPage extends BaseMethods{
    private By PUBLISHER_SEARCH = By.id("cat_search");
    private By CLICK_SEARCH = By.xpath("//button[@class='btn btn-default']");
    private By CLICK_PUBLISHER_NAME = By.xpath("//a[@class='author_name']");
    private By SUBJECT_RADIO_BUTTON =By.xpath("//div[@id='product_cat_str:কম্পিউটার প্রোগ্রামিং']");
    private By BOOK_NAME = By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > article:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");

    public void publisherSearchForName(){
        writeText(PUBLISHER_SEARCH,"অন্বেষা প্রকাশন");
        clickOnElement(CLICK_SEARCH);
    }
    public void clickPublisherName(){
        clickOnElement(CLICK_PUBLISHER_NAME);
    }
    public void clickSubject(){
        clickOnElement(SUBJECT_RADIO_BUTTON);
    }
    public void clickBook(){
        clickOnElement(BOOK_NAME);
    }
}
