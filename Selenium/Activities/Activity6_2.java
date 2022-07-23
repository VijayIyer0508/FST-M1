import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.*;


public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/ajax");
	    System.out.println("The title of the page is :" +driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'Change Content')]"));
		
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	    System.out.println(ajaxText);
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	    String lateText = driver.findElement(By.id("ajax-content")).getText();
	    System.out.println(lateText);
	    driver.close();
	}

}
