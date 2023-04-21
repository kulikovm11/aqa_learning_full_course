package testPackage.Lesson6FrameWorkTest;


import base.BaseTest;

import static Pages.Pages.loginPage;

public class L6FrameWorkTest extends BaseTest {
//    @Test
    public void test(){
        loginPage().typeUserName("standard_user");
        loginPage().typeUserPassword("secret_sauce");
        loginPage().clickLoginButton();
    }
}
