package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeClass(alwaysRun = true)
    public void configurations () {
        Configuration.startMaximized = true;
//        Configuration.browserSize = "800x600";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
        Configuration.pageLoadTimeout = 10000;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        Selenide.open("https://www.saucedemo.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanWebDriver(){
//        Selenide.clearBrowserCookies();
//        Selenide.refresh();
//        Selenide.open("about:blank");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
//        Selenide.closeWebDriver();
    }



}
