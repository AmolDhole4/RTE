package RTE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RTEVER {
	
	
	@Test(dataProvider="logindata",dataProviderClass = MultipleData.class)
	public void test(String Data) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://student.maharashtra.gov.in/adm_portal/Users/rte_index_new");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1200"
				+ ")", "");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		////input[@id='appl_no']
		WebElement ele = driver.findElement(By.id("applwisedetails"));
		ele.click();
		
		WebElement	element=	driver.findElement(By.xpath("//input[@id='appl_no']"));
		element.sendKeys(Data);
	
	//	j.executeScript("arguments[0].value='25PU044923", element);
			driver.findElement(By.xpath("//button[@class=\"admmround\"]")).click();	//button[@class="admmround"]
		Thread.sleep(2000);
		WebElement table = driver.findElement(By.xpath("(//table[@class=\"table-block-details\"])[3]"));
		String data=table.getText();
		System.out.println(data);
		driver.quit();
		
	}


}
