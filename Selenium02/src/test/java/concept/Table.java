package concept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");

		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Scroll(0,600)");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)", "");
		List<WebElement> table_dat = driver.findElements(By.xpath("//table[@id=\"resultTable\"]//td[2]"));
		
		for(WebElement dta:table_dat) {
		String d=	dta.getText();
		System.out.println(d);
		}
		
}
}
