package Test_selenium_project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;


public class Activity3 {
  @Test
  public void CopyFooterText() {
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		WebElement footer=driver.findElement(By.id("admin_options"));
		System.out.println("The text of the Footer"+footer.getText());
		driver.close();
  }
}
