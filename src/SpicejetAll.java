
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class SpicejetAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value ='IXB']")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value ='DEL']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'20')]")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000L);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		List<WebElement> prices =driver.findElements(By.xpath("//span[@class='flightfare']"));
		List<WebElement> info =driver.findElements(By.cssSelector("input[id*='ControlGroup'][type='radio']"));
		
		
		double max = Double.parseDouble(prices.get(0).getText().replace("INR", "").replace(",", "").trim());
		int index = 0;
		
		for (int i = 0; i < prices.size(); i++) {
			System.out.println(Double.parseDouble(prices.get(i).getText().replace("INR", "").replace(",", "").trim()));
			if(Double.parseDouble(prices.get(i).getText().replace("INR", "").replace(",", "").trim())>max) {
				max= Double.parseDouble(prices.get(i).getText().replace("INR", "").replace(",", "").trim());
				index = i;
			}
		}
			

		
		prices.get(index).click();
		System.out.println("Details are :" + info.get(index).getAttribute("value"));
		driver.findElement(By.xpath("//span[@class='button-continue-text']")).click();
		System.out.println("Most expensive flight costs " + max);
		System.out.println("done");
		
		// Esras code from here
		
//		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
//		driver.get("https://www.spicejet.com/");
//		//driver.manage().window().maximize();
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.cssSelector("a[value='MAA']")).click();
//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("del");
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();
//		while(!driver.findElement(By.className("ui-datepicker-title")).getText().contains("August")) {
//			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
//		}
//		
//		List<WebElement> list = driver.findElements(By.className("ui-state-default"));
//		for(int i=0; i<list.size();i++) {
//			if(list.get(i).getText().equalsIgnoreCase("23")) {
//				list.get(i).click();
//				break;
//			}
//			
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
//		
//		Select currency = new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//		currency.selectByVisibleText("USD");
//		
//		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//		
//		int count = driver.findElements(By.cssSelector("tr[class*='fare-row'] td:nth-child(4)")).size();
//		double max=Double.MIN_VALUE;
//		double price;
//		int maxi=-1;
//		for (int i=0; i<count ; i++) {
//			int size= driver.findElements(By.cssSelector("tr[class*='fare-row'] td:nth-child(4)")).get(i).getText().trim().length();
//			price=Double.parseDouble(driver.findElements(By.cssSelector("tr[class*='fare-row'] td:nth-child(4)")).get(i).getText().trim().substring(0,size-4));
//			if(price>max) {
//				max=price;
//				maxi=i;
//			}
//		}
//		driver.findElements(By.cssSelector("tr[class*='fare-row'] td:nth-child(4) input")).get(maxi).click();;
//		driver.findElement(By.cssSelector("[class='button-continue-text']")).click();
//		
	}

}
