import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("random");
		driver.findElement(By.id("password")).sendKeys("random");
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		
		System.out.println(driver.findElement(By.id("error")).getText());
		driver.findElement(By.id("error")).getText();
		driver.findElement(By.xpath("//*[@class='fl small']")).click();
		driver.findElement(By.cssSelector("[class*='secondary']")).click();
	}
	
}
