package page_objects;

import commons.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TimeTablePage extends GeneralPage{

    private String dynamicTimeTableRow = "//table/tbody//td[text()='%s']/following-sibling::td[text()='%s']/following-sibling::td/a[text()='check price']";

    public WebElement clickCheckPrice(String a, String b){
        By timeTableRow = By.xpath(String.format(dynamicTimeTableRow, a, b));
        return Constant.WEBDRIVER.findElement(timeTableRow);
    }

    public TicketPricePage clickAnyCheckPrice(){
        //  click any check price button (in this case try one of them)
        this.clickCheckPrice("Sài Gòn", "Phan Thiết").click();
        return new TicketPricePage();
    }

}