package Test_selenium_project;

import org.testng.annotations.Test;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class Activity5 {
  @Test
  public void idenitfyColor() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm/");
	  
	  WebElement username = driver.findElement(By.id("user_name"));
	  username.sendKeys("admin");
	 
	  WebElement password = driver.findElement(By.name("username_password"));
	  String pass ="pa$$w0rd";
	  password.sendKeys(pass);
	  WebElement Submit = driver.findElement(By.id("bigbutton"));
	  Submit.submit();	  
	  Thread.sleep(5000);
	  String color = driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("color");
	  
	  System.out.println("The color of naviagtion : " +color);
	  
	  color = Color.fromString(color).asHex();
	  System.out.println("The color of naviagtion after Hex:" +color);
	  driver.close();
  }
}
