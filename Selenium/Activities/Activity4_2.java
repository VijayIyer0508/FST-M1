import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("The title of the page is :" +driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Iyer");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8934534567");
	    driver.findElement(By.tagName("textarea")).sendKeys("This is vijay Iyer");
	    driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();
	    
	}

}
