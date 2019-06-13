import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		
		driver.findElement(By.cssSelector("[title = 'Create an account']")).click();
		System.out.println(driver.getTitle());
		Set<String> ids =  driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String child  = it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}

}
