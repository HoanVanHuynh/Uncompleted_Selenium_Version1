package commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AbstractPage {

    public static void clickElement(WebElement webElement){
        Actions actions = new Actions(Constant.WEBDRIVER);
        actions.moveToElement(webElement).click().perform();
    }

}
