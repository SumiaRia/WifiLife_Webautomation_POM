package methods;

import org.openqa.selenium.By;

public class BlogPage extends BaseMethods{
    private By SUBJECT = By.cssSelector("aside[id='categories-3'] li[class='cat-item cat-item-30'] a");
    private By READ_MORE =By.xpath("//span[@class='post_readmore_label']");
    public void clickSubject(){
        clickOnElement(SUBJECT);
    }
    public void clickReadMore(){
        clickOnElement(READ_MORE);
    }
}
