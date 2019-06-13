import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i = 1; i <=4; i++)
		driver.findElement(By.id("hrefIncAdt")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		
		
		
//		Select s = new Select(driver.findElement(By.cssSelector("select[name*='ctl00$mainContent$DropDownListCurrency']"))) ;
//		s.selectByValue("USD");
//		s.selectByIndex(2);
//		s.selectByVisibleText("USD");
//		
		
	}

}
