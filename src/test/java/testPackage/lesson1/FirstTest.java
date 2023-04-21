package testPackage.lesson1;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest extends BaseTest {
//    @Test
    public void test(){
        $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");
//        $(By.xpath("//input[@placeholder='Username']")).clear();
        $(By.xpath("//input[@type='submit']")).click();
    }

}

