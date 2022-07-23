import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("The title of the page is :" +driver.getTitle());
		
		Thread.sleep(10);
		
		WebElement name = driver.findElement(By.id("firstName"));
		name.sendKeys("Vijay");
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("IYER");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("abc@gmail.com");
		
		WebElement ccNo = driver.findElement(By.id("number"));
		ccNo.sendKeys("95128934567");
		
		WebElement submit = driver.findElement(By.cssSelector("input.ui.green.button"));
		submit.click();
		driver.close();
	}

}
