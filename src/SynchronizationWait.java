import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SynchronizationWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.xpath("//*[@id='start']//button")).click();
		
	
	
	}

}
