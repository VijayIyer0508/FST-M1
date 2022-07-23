import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is :" +driver.getTitle());
	 	WebElement cbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The Check box is visible" +cbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("The Check box is visible" +cbox.isDisplayed());
        driver.close();
	}

}
