import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarLecture59 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value ='IXB']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value ='DEL']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'20')]")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	}

}


//driver.findElement(By.id("divpaxinfo")).click();
//Thread.sleep(2000L);
//
//for(int i = 1; i <=4; i++)
//driver.findElement(By.id("hrefIncAdt")).click();
//
//driver.findElement(By.id("btnclosepaxoption")).click();