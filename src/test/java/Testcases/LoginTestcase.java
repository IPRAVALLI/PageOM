package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.BookHotel;
import Pages.LoginPage;
import Pages.SearchHotel;

public class LoginTestcase {
  @Test
  public void Login() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
      driver.navigate().to("http://adactinhotelapp.com");
      LoginPage obj = new LoginPage(driver);
      obj.username();
      obj.pass();
      obj.login();
 	System.out.println("the test is done");
      SearchHotel obj1 = new SearchHotel(driver);
      obj1.locationSelect("Sydney");
      obj1.sea();
      obj1.radio();
      obj1.con();
      
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     
      BookHotel obj2 = new BookHotel(driver);
      obj2.Fname();
      obj2.Lname();
      obj2.Address();
      obj2.Credit();
      obj2.creditSelect("VISA");
      obj2.monthSelect(10);
      obj2.yearSelect("2024");
      obj2.Cvv();
      obj2.Booknow();
      WebElement OrdNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
      obj2.Orderno();
      
      
 } 
  
}
