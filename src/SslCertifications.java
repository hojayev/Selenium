import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class SslCertifications {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Desired capabilities for general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//This belongs to local browser
		ChromeOptions c = new ChromeOptions();
		//combines both in c
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.cnn.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Berdy\\Desktop\\screenshot.jpg"));
	}

}
