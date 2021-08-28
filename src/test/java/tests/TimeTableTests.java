package tests;


import commons.Constant;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_objects.*;


public class TimeTableTests  extends BaseTest {

    @Test(description = "User can navigate to train ticket page by clicking on check price button")
    public void tc001_Button(){
        HomePage homePage = new HomePage();
        homePage.open();
        TimeTablePage timeTablePage = homePage.goToTimeTablePage();
        WebDriverWait wait = new WebDriverWait(Constant.WEBDRIVER, 3);
        wait.until(ExpectedConditions.elementToBeClickable(timeTablePage.clickCheckPrice("Sài Gòn", "Phan Thiết")));
        timeTablePage.clickAnyCheckPrice();
s
    }

}