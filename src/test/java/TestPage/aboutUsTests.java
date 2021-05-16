package TestPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aboutUsTests {
	
	WebDriver driver;
	
	@Test
	public void getUrl() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://34.229.166.157:5775/");
		driver.findElement(By.xpath("//a[@id='About Us']")).click();
		String aboutUsPageContent = driver.getPageSource();
		System.out.println("aboutUsPageContent :" + aboutUsPageContent);
		Assert.assertTrue(aboutUsPageContent.contains("about"));
		driver.quit();
		
		
		
	}

}
