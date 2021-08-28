package tests;

import commons.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.LoginPage;


public class LoginTests  extends BaseTest {

    @Test(description = "User can can log in successfully with valid email and password")
    public void tc001_Login(){
        HomePage homePage = new HomePage();
        homePage.open();
        LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = loginPage.clickLogin().getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg);
        loginPage.goBackToHomePage();
    }

}
