import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("The title of the page is :" +driver.getTitle());
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/a[1]")).click();
		
		System.out.println("The title of the page is :" +driver.getTitle());
		driver.close();
	
	}

}
