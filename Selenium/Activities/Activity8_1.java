import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;


public class Activity8_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
	    System.out.println("The title of the page is :" +driver.getTitle());
	    List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
	    System.out.println("The colums size is "+col.size());
	   
	    List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
	    System.out.println("The row size is "+row.size());
	    
	    List<WebElement> trow = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
	    
	    for(WebElement cval:trow)
	    {
	    	System.out.println("The third row value is "+cval.getText());
	    }
	    
	    WebElement cval2 = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
	    System.out.println("The second row and second column value is "+cval2.getText());
	    
	    driver.close();
	}
}