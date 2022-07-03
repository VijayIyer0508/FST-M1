package Test_selenium_project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity2 {
  @Test
   public void getImageUrl() {
  	  WebDriver driver = new FirefoxDriver();
  		driver.get("https://alchemy.hguy.co/crm/");
  		WebElement url = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
  	   System.out.println("The url of the image is"+driver.getCurrentUrl());
  	   driver.close();
   }
    
}
