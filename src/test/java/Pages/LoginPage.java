package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	By uname= By.id("username");
	By password = By.id("password");
	By loginbutton = By.id("login");
	public void username() {
		driver.findElement(uname).sendKeys("aswinishiva");
	}
	
	public void pass() {
		driver.findElement(password).sendKeys("Ashu@2001");
	}
	public void login() {
		driver.findElement(loginbutton).click();
		
	}
	
	
	
	
	
	

}
