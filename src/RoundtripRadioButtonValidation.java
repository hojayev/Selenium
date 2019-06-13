import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class RoundtripRadioButtonValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value ='IXB']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value ='DEL']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'20')]")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		
		
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
//		
//		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
//		System.out.println("Done");
		
	}

}
