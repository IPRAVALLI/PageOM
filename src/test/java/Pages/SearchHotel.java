package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel{
	WebDriver driver;
	
	public SearchHotel(WebDriver driver) {
	this.driver = driver;
}
    By loc = By.id("location");
    By search = By.id("Submit");
    By button = By.xpath("//input[@name='radiobutton_1']");
    By continu = By.id("continue");
    public void locationSelect(String loccity) {
    	WebElement  ele = driver.findElement(loc);
    	Select drop = new Select(ele);
    	drop.selectByVisibleText(loccity);
    	
    }
    public void sea() {
    	driver.findElement(search).click();
    }
    public void radio() {
    	driver.findElement(button).click();
    }
    public void con() {
    	driver.findElement(continu).click();
    }
    
}
