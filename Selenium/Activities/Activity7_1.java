import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.*;


public class Activity7_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get(" https://training-support.net/selenium/dynamic-attributes");
	    System.out.println("The title of the page is :" +driver.getTitle());
	   
	    driver.findElement(By.xpath("//input[contains(@class ,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class ,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
	    String ajaxText = driver.findElement(By.id("action-confirmation")).getText();
	    System.out.println(ajaxText);
	    
	    driver.close();
	}

}
