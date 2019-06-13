

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class Number1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("bhocayev@hotmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Mclarenlp1!");
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		//driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//a[@class='_2s25 _606w']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//img[@class='scaledImageFitHeight img']")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[@class = '_81hb']")).getText());
		
		
//		
//		driver.findElement(By.id("logoutMenu")).click();
		
		
//		driver.get("http://www.cnn.com");
//		driver.navigate().back();
		
		
//		driver.get("https://ok.ru");
//		driver.findElement(By.id("field_email")).sendKeys("hojayev");
//		driver.findElement(By.id("field_password")).sendKeys("asd67tr");
//		driver.findElement(By.xpath("//*[@id='anonymPageContent']/div[2]/div/div[2]/form/div[5]/div[1]/input")).click();
//		
//		Select s = new Select(driver.findElement(By.xpath("//div[@class='ucard-mini toolbar_ucard js-toolbar-menu']")));
//		
//		s.selectByVisibleText("Выйти");
	}

}

