import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		driver.get("https://training-support.net/selenium/dynamic-controls");
	    System.out.println("The title of the page is :" +driver.getTitle());
		/* Thread.sleep(1000);
		driver.findElement(By.id("login")).sendKeys("vijay.iyer@consultant.vodafoneomnitel.it");
		driver.findElement(By.id("passwd")).sendKeys("Maggio2041"); */
		driver.findElement(By.id("toggleCheckbox")).click();
        
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		
		driver.close();
		
		
		
	}

}
