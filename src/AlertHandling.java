import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	
	
		driver.findElement(By.xpath("//div[@class='display']//form//input")).click();
	
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	
	
	}

}
