package Pages.LoginPage;

import base.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends PageTools {

    private final By userNameInput = By.xpath("//input[@placeholder='Username']");
    private final By userPasswordInput = By.xpath("//input[@placeholder='Password']");
    private final By loginButton = By.xpath("//input[@type='submit']");

    public void typeUserName (String userName){
        type(userName, userNameInput);
    }

    public void typeUserPassword (String userPassword){
        type(userPassword, userPasswordInput);
    }

    public void clickLoginButton () {

        click(loginButton);
    }



}
