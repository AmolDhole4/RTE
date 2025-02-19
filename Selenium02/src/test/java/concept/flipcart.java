package concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipcart {
	
	@Test
	public void Test1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	 WebElement search = driver.findElement(By.name("q"));
	 search.sendKeys("laptop");
	 search. sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("(//div[text()='₹44,990']/ancestor::div)[9]")).click();

}
}
