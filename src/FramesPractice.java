import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class FramesPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://spinbot.com/Login");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src*='anchor']")));
		Thread.sleep(3000L);
		driver.findElement(By.cssSelector("div[class = 'recaptcha-checkbox-border']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title = 'recaptcha challenge']")));
		driver.findElement(By.cssSelector("div[class = 'verify-button-holder'] button")).click();
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//		Actions a = new Actions(driver);
//		
//		a.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
//		
//		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
//		System.out.println("Done");
	}

}


 			