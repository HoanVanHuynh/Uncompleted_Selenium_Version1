package page_objects;

import commons.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    private final By tabLogin = By.cssSelector("a[href$='Login.cshtml']");
    private final By tabLogout = By.cssSelector("a[href$='Logout']");
    private final By lblwelcomeMessage = By.cssSelector("div[class='account'] > strong");
    private final By tabRegister = By.cssSelector("li > a[href$='Register.cshtml']");
    private final By tabTimeTable = By.cssSelector("a[href='TrainTimeListPage.cshtml']");
    private final By tabTicketPrice = By.cssSelector("a[href$='TrainPriceListPage.cshtml']");
    private final By tabBookTicket = By.cssSelector("a[href$='BookTicketPage.cshtml']");

    protected WebElement getTabTimeTable(){
        return Constant.WEBDRIVER.findElement(tabTimeTable);
    }

    protected WebElement getTabTicketPrice(){
        return Constant.WEBDRIVER.findElement(tabTicketPrice);
    }

    protected WebElement getTabBookTicket(){
        return Constant.WEBDRIVER.findElement(tabBookTicket);
    }

    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getlblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblwelcomeMessage);
    }

    protected  WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }


    public String getWelcomeMessage(){
        return this.getlblWelcomeMessage().getText();
    }

    public LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new LoginPage();
    }

    public HomePage goBackToHomePage(){
        this.getTabLogout().click();
        return new HomePage();
    }

    public RegisterPage goToRegisterPage(){
        this.getTabRegister().click();
        return new RegisterPage();
    }

    public TimeTablePage goToTimeTablePage(){
        this.getTabTimeTable().click();;
        return new TimeTablePage();
    }

    public TicketPricePage gotoTicketPricePage(){
        this.getTabBookTicket().click();
        return new TicketPricePage();
    }

}
