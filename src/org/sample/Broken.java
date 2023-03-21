package org.sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("count of avaiable links:"+links.size());
	for (WebElement link : links) {
		String linkurl = link.getAttribute("href");
		if (linkurl!=null) {
		// 1.linkurl(string) into url
			URL url = new URL(linkurl);
		// 2. establish connection---URL connection
			URLConnection o = url.openConnection();
		// 3.URLConnection into HTTPURLconnection
			HttpURLConnection h =  (HttpURLConnection)o;
		// get the response code
			int code = h.getResponseCode();
			if (code!=200) {
				System.out.println(linkurl+"broken: "+code);
			}
			
			
			
			
			
			
		}
	}
	
	
}
}
