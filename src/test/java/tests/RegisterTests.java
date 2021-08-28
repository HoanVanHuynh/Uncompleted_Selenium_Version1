package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.RegisterPage;

public class RegisterTests extends BaseTest {


    @Test(description = "Register with valid email, password, confirm password and passpord")
    public void tc001_RegisterWithValidInformation() {
        HomePage homepage = new HomePage();
        homepage.open();
        RegisterPage registerPage = homepage.goToRegisterPage();
        registerPage.register("workhard@gmail.com", "1234567890", "1234567890", "111111111111");
        String actualResult = registerPage.clickRegister().getRegisterWelcome();
        String expectedResutl = "You're here";
        Assert.assertEquals(actualResult, expectedResutl);
    }
}