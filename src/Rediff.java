import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("[class = 'signin']")).click();
		driver.findElement(By.id("login1")).sendKeys("helloitisme");
		driver.findElement(By.cssSelector("input#password")).sendKeys("helloitisme");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		driver.findElement(By.xpath("//div[@class='text'")).getText();
		
		
		
		
	}

}
