package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookHotel {
WebDriver driver;
	
	public BookHotel(WebDriver driver) {
	this.driver = driver;
	}
	By fname = By.id("first_name");
	By lname = By.id("last_name");
	By address = By.id("address");
	By credit = By.id("cc_num");
	By credit_Dropdown = By.id("cc_type");
	By mon_Dropdown = By.id("cc_exp_month");
	By year_Dropdown = By.id("cc_exp_year");
	By cvv = By.id("cc_cvv");
	By booknow = By.id("book_now");
	By orderno = By.id("order_no");	
			
			
	public void Fname() {
		driver.findElement(fname).sendKeys("Pravallika");
	}
	public void Lname() {
		driver.findElement(lname).sendKeys("Inkula");
	}
	public void Address() {
		driver.findElement(address).sendKeys("10-9-47,sudda street, vizianagaram");
	}
	public void Credit() {
		driver.findElement(credit).sendKeys("1234567890123456");
	}
	public void creditSelect(String creditDropdown) {
		WebElement  ele = driver.findElement(credit_Dropdown);
    	Select drop = new Select(ele);
    	drop.selectByValue(creditDropdown);
	}
	public void monthSelect(int monthDropdown) {
		WebElement  ele1 = driver.findElement(mon_Dropdown);
    	Select drop = new Select(ele1);
    	drop.selectByIndex(monthDropdown);
		
	}
	public void yearSelect(String yearDropdown) {
		WebElement  ele2 = driver.findElement(year_Dropdown);
    	Select drop = new Select(ele2);
    	drop.selectByValue(yearDropdown);
		
	}
	public void Cvv() {
		driver.findElement(cvv).sendKeys("1345");
	}
	public void Booknow() {
		driver.findElement(booknow).click();
	}
	public void Orderno() {
		WebElement OrdNum = driver.findElement(orderno);
		String text = OrdNum.getAttribute("value");
		//driver.findElement(orderno);
		
		System.out.println("order number "+ text);
	}
	

}
