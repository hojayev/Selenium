import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
//		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Try Prime')]"))).build().perform();
//		Thread.sleep(4000L);
//		a.moveToElement(driver.findElement(By.cssSelector("span[class='nav-cart-icon nav-sprite'] "))).build().perform();

		//input[@id='twotabsearchtextbox']
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		a.moveToElement(search).click().sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
	
	}

}
