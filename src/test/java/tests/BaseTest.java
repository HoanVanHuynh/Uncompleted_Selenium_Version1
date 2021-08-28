package tests;

import Utils.Utilities;
import commons.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

// the super class for any test class we create
public class BaseTest {




    @BeforeClass
    public static void setUp(){

        String path = System.getProperty("user.dir")
        System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        Constant.WEBDRIVER.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        Constant.WEBDRIVER.quit();
    }

}
