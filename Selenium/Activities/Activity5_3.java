import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is :" +driver.getTitle());
	 	WebElement tbox = driver.findElement(By.id("dynamicText"));
	 	System.out.println("The text box is enabled"+tbox.isEnabled());
	 	driver.findElement(By.id("toggleInput")).click();
	 	System.out.println("The text box is enabled"+tbox.isEnabled());
	 	driver.close();
	 	
	 
	}

}
