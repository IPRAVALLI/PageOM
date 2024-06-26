import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWaits {
	@Test

	public void m1(){

        String website_url = "https://www.selenium.dev/selenium/web/dynamic.html";

        WebDriver driver = new ChromeDriver();
        driver.get(website_url);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement button = driver.findElement(By.id("reveal"));
        button.click();
        WebElement textbox  = driver.findElement(By.id("revealed"));
        //webDriverWait.until(ExpectedConditions.visibilityOf(textbox));
        FluentWait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(200));
        fluentWait.until(ExpectedConditions.visibilityOf(textbox));
        textbox.sendKeys("hello....");

}
}