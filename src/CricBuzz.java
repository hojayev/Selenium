import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CricBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//div[@class='cb-col cb-col-8 text-right text-bold']
		
		//div[@id='innings_1']
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20250/ind-vs-aus-match-14-icc-cricket-world-cup-2019");
		

		
		
		//next line limits the driver to the selected table
		WebElement table = driver.findElement(By.cssSelector("div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//collects all elements of the scores in an ArrayList
		List<WebElement> scores = table.findElements(By.cssSelector("div[class= 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		//System.out.println(scores.size());
		int scoreSum = 0;
		
		//scores.size()-2 because last two elements are different
		for (int i = 0; i < scores.size()-2; i++) {
			System.out.println(scores.get(i).getText());
			scoreSum += Integer.parseInt(scores.get(i).getText());
			System.out.println("Sum is " + scoreSum);
		}
		
		//another list to include second column
		//it is also possible to get there through "Extras" and use following::sibling
		List <WebElement> second = table.findElements(By.cssSelector("div[class= 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)"));
 		scoreSum += Integer.parseInt(second.get(second.size()-3).getText()); 
 		System.out.println("Sum is " + scoreSum);
 		
 		//compares calculated sum with the sum given on the website
 		Assert.assertEquals(scoreSum, Integer.parseInt(second.get(second.size()-2).getText()));
 		
 		System.out.println("Done");
	}
		
}
