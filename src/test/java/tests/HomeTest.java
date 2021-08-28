package tests;

import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.RegisterPage;

public class HomeTest extends BaseTest {
    RegisterPage registerPage;

    @Test(description = "User can navigate to register page by clicking on create an account hyperlink")
    public void tc001_GoToRegisterPage(){
        HomePage homePage = new HomePage();
        homePage.open();
        registerPage = homePage.goToRegisterPage();
    }

}
