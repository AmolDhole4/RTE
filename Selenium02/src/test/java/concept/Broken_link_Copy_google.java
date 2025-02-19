package concept;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_link_Copy_google {
	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();

		// Navigate to BStackDemo Website
		driver.get("https://bstackdemo.com/");


		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));


		// Iterating each link and checking the response status
		for (WebElement link : links) {
		String url = link.getAttribute("href");
		verifyLink(url);
		}


		driver.quit();
		}


		public static void verifyLink(String url) {
		try {
		   


		HttpURLConnection httpURLConnection = null;
		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
		}
		

}
