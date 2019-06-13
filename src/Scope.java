import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		List <WebElement> list1 = driver.findElements(By.cssSelector("[id='gf-BIG'] a"));
		System.out.println(list1.size());
		
		WebElement firstFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println(firstFooter.findElements(By.tagName("a")).size());
	}

}
