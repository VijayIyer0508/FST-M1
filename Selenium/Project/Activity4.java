package Test_selenium_project;

import static org.testng.Assert.assertSame;
import java.lang.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class Activity4 {
  @Test
  public void LoginPage() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm/");
	  
	  WebElement username = driver.findElement(By.id("user_name"));
	  username.sendKeys("admin");
	 
	  WebElement password = driver.findElement(By.name("username_password"));
	  String pass ="pa$$w0rd";
	  password.sendKeys(pass);
	  WebElement Submit = driver.findElement(By.id("bigbutton"));
	  Submit.submit();	  
	  
	  System.out.println("The title of the page is :" +driver.getTitle());
	 Thread.sleep(5000);
	  Boolean User= driver.findElement(By.xpath("//div[@class='desktop-bar']/ul/li[@id='globalLinks']//span[contains(text(),'admin')]")).isDisplayed();
	  System.out.print("Value of User" +User); 
	 
	 if(User)
	  {
		  System.out.println("\nLogin is successful");
		  
	  }
	  else
		{
		  System.out.println("Login is unsuccessful");
		}
	 driver.close();
  }
}
