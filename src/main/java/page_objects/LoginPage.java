package page_objects;

import commons.AbstractPage;
import commons.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{

    private By txtEmail = By.id("username");
    private By txtPassword = By.id("password");
    private By btnLogin = By.cssSelector("input[value='Login']");

    private  WebElement getTxtEmail(){
        return Constant.WEBDRIVER.findElement(txtEmail);
    }

    private  WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    private  WebElement getBtnLogin() {
        return Constant.WEBDRIVER.findElement(btnLogin);
    }

    public void login(String username, String password){
        this.getTxtEmail().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
    }

    public HomePage clickLogin(){
        AbstractPage.clickElement(this.getBtnLogin());
        return new HomePage();
    }

}


