import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String website_url = "https://www.selenium.dev/selenium/web/dynamic.html";

        WebDriver driver = new ChromeDriver();
        driver.get(website_url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement button = driver.findElement(By.id("reveal"));
        button.click();


	}

}
