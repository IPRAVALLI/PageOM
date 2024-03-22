import org.testng.annotations.Test;

public class SeleniumWaits {
  @Test
  public void m1() {
	  String website_url = "https://www.selenium.dev/selenium/web/dynamic.html";

      WebDriver driver = new ChromeDriver();
      driver.get(website_url);

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
      WebElement button = driver.findElement(By.id("reveal"));
      button.click();
  }
}
