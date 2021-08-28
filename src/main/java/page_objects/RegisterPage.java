package page_objects;

import commons.AbstractPage;
import commons.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage{


    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By pidField = By.id("pid");
    private By btnRegister = By.cssSelector("input[value='Register']");
    private final By registerWelcomeMessage = By.cssSelector("div[id='content'] > p ");


    public WebElement getRegisterWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(registerWelcomeMessage);
    }

    public String getRegisterWelcome(){
        return this.getRegisterWelcomeMessage().getText();
    }


    private WebElement getEmailField(){
        return Constant.WEBDRIVER.findElement(emailField);
    }

    private WebElement getPasswordField(){
        return Constant.WEBDRIVER.findElement(passwordField);
    }

    private WebElement getConfirmPassword(){
        return Constant.WEBDRIVER.findElement(confirmPasswordField);
    }

    private WebElement getPidField(){
        return Constant.WEBDRIVER.findElement(pidField);
    }

    private WebElement getBtnRegister(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }



    public void register(String email, String password, String confirmPassword, String pid){
        this.getEmailField().sendKeys(email);
        this.getPasswordField().sendKeys(password);
        this.getConfirmPassword().sendKeys(confirmPassword);
        this.getPidField().sendKeys(pid);
    }

    public RegisterPage clickRegister(){
        AbstractPage.clickElement(this.getBtnRegister());
        return new RegisterPage();
    }

}
