import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.cssSelector("input[value='Butter']")).click();
		driver.findElement(By.cssSelector("input[value='Beer']")).click();
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();

		
		List<WebElement> options = driver.findElements(By.cssSelector("input[name*='group']"));
		
		for (int  i = 0; i<options.size();i++ ) {
						
			System.out.println(options.get(i).getAttribute("value"));
		}
		
		System.out.println(options.size());
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='Beer']")).isSelected());
		
		
		
		
		
		
		
		
//		driver.get("https://www.w3.org/TR/2017/WD-wai-aria-practices-1.1-20170628/examples/radio/radio-1/radio-1.html");
		
		
		
		
		
		
//		driver.get("http://www.echoecho.com/tooldropdown.htm");
//		driver.findElement(By.xpath("//td[@class = 'table5']//input[@value='true']")).click(); 
//		driver.findElement(By.xpath("//input[@name='GO!']")).click();
//		
		
	}

}
