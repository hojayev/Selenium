import java.util.List;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		WebElement from = driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		from.clear();
		from.sendKeys("mum");
		Thread.sleep(3000L);
		from.sendKeys(Keys.DOWN);
		from.sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//div[contains(@class,'calc60')]")).click();

		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("bangkok");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys(Keys.ENTER);

		Thread.sleep(3000L);
		List<WebElement> fromDate = driver.findElements(By.cssSelector("p[class = 'priceLow todayPrice']"));
		System.out.println(fromDate.size());

		int cheapest = Integer.parseInt(fromDate.get(0).getText());
		int index  = 0;
		for (int i = 0; i < fromDate.size(); i++) {
			if(Integer.parseInt(fromDate.get(i).getText())<cheapest) {
				cheapest = Integer.parseInt(fromDate.get(i).getText());
				index = i;
				
				System.out.println("Cheapest is " + cheapest + " index is " + index);
			}
		}
		fromDate.get(index).click();
		System.out.println("Cheapest ticket is" + cheapest);
		

	}

}
