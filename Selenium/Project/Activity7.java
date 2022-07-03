package Test_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity7  {
  @Test
  public void ReadAdditionalInfo() throws InterruptedException {
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
	  
	 String Item = driver.findElement(By.xpath("//a[@id='grouptab_0']")).getText();
	 System.out.println("The menu Item Actvities name:" +Item);
     
	 WebElement Menu =  driver.findElement(By.xpath("//a[@id='grouptab_0']"));
	 Menu.click();
	 
	 WebElement SubMenu =  driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']"));
	 SubMenu.click();
	 Thread.sleep(10000);
	 
  }
}
