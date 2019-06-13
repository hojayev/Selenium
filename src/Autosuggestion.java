import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement input = driver.findElement(By.cssSelector("input[type = 'text']"));
		input.sendKeys("ben");
		input.sendKeys(Keys.ARROW_DOWN);

		
		//because the text is hidden we have to access it through javascript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = "";
		
		
		//this part will press down arrow until we find desired element
		int x = 1;
		while(!text.equalsIgnoreCase("bengalu airport") && x<=10) {
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		text = (String) js.executeScript(script);
		input.sendKeys(Keys.ARROW_DOWN);
		System.out.println("DOWN");
		x++;
		}
		System.out.println(text);
		System.out.println("done");

		
		
	}

}
