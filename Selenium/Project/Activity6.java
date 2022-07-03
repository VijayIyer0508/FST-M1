package Test_selenium_project;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class Activity6 {
  @Test
  public void LocateMenuitem() throws InterruptedException {
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
	  
	 String Item = driver.findElement(By.xpath("//a[@id='grouptab_3']")).getText();
	 System.out.println("The menu Item Actvities name:" +Item);
      
	WebElement Menu =  driver.findElement(By.xpath("//a[@id='grouptab_3']"));
	Menu.click();
	driver.close();

  }
  
}
