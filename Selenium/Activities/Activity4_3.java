import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		System.out.println("The title of the page is :" +driver.getTitle());
		WebElement Theader=driver.findElement(By.xpath("//h3[@id='third-header']"));
		System.out.println("The Third Header is" +Theader);
		String Hcolor = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("The Fifth Header color is" +Hcolor);
		
		WebElement violetclass= driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
		String violet = violetclass.getAttribute("class");
		System.out.println(violet);
		
	    System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
	    
	    driver.close();
	}

}
