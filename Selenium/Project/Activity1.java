package Test_selenium_project;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
  @Test
  public void testing() {
	  WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		String title= driver.getTitle();
		System.out.println("Title" +title);	
		if(title=="TitleSuiteCRM")
		driver.close();
	  
  }
}
