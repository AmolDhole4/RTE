package concept;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Link {
	
	@Test
	public void Test1() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	List<WebElement> Links = driver.findElements(By.tagName("a"));
	System.out.println(Links.size());
	for(WebElement link:Links) {
	int count=1;
	String li = link.getAttribute("herf");
	//URL url =new URL(li);
	URL url = new URL(li);
	//HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	//httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
	//httpURLConnection.connect();
URLConnection urlConnection =url.openConnection();
HttpURLConnection httpURLConnection =(HttpURLConnection)urlConnection;
httpURLConnection.connect();
int sattusCode=httpURLConnection.getResponseCode();

if(sattusCode>=400) {
	//System.out.println("Link_IS_Broken"+li);
//	count++;
	
}
	//System.out.println(count);	
	}

}
}
