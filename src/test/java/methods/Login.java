package methods;

import org.openqa.selenium.By;

public class Login extends BaseMethods{
    private By EMAIL = By.id("username");
    private By PASSWORD = By.id("password");
    private By LOGIN_BUTTON = By.xpath("//input[@name='login']");
    public void loginCredential(){
        writeText(EMAIL,"");
        writeText(PASSWORD,"");
        clickOnElement(LOGIN_BUTTON);
    }
}
