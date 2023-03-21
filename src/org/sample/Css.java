package org.sample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement mail = driver.findElement(By.id("email"));
	    js.executeScript("arguments[0].setAttribute('style','font-size:40px;text-align:left;background:green')", mail);
	    WebElement passwd = driver.findElement(By.id("pass"));
	    js.executeScript("arguments[0].setAttribute('style','background:yellow;border:10px solid green')", passwd);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
