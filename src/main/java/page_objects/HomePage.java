package page_objects;

import commons.AbstractPage;
import commons.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends GeneralPage {

    private By createAnAccountLink = By.partialLinkText("create an account");

    public WebElement getCreateAnAccountLink(){
        return Constant.WEBDRIVER.findElement(createAnAccountLink);
    }

    public RegisterPage goToRegisterPage(){
        this.getCreateAnAccountLink().click();
        return new RegisterPage();
    }

    // This is a method that starts our test cases
    public HomePage open(){
        Constant.WEBDRIVER.navigate().to(Constant.URL);
        return this;
    }
}
