import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
 public static void main(String args[])
 {
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("The title of the page is :" +driver.getTitle());
		
		WebElement id = driver.findElement(By.id("about-link"));
		System.out.println("The About us Link by id :" + id.getText());
		
		
		WebElement Css = driver.findElement(By.cssSelector("#about-link"));
		System.out.println("The About us Link by Css selector :" + Css.getText());
		
		WebElement linkText = driver.findElement(By.linkText("About Us"));
		System.out.println("The About us Link by Link Text :" + linkText.getText());
		
		WebElement CN = driver.findElement(By.className("green"));
		System.out.println("The About us Link by ClassName :" + CN.getText());
		
		
		driver.close();
		
 }
}
