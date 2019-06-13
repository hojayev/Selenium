import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		for (int i = 0; i < 6; i++) {
			if(driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("id").contains("IndArm")) {
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			}
			
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("for"));	
		}
		//ctl00_mainContent_chk_StudentDiscount
	}

}
