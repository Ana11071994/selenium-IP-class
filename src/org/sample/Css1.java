package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// css selector
		driver.get("https://www.facebook.com/");
		//1
		WebElement email = driver.findElement(By.cssSelector("._6lux"));
		WebElement pass = driver.findElement(By.cssSelector("#passContainer"));
		//2
		
		WebElement email2 = driver.findElement(By.cssSelector("input#email"));
		WebElement pass2 = driver.findElement(By.cssSelector("div#passContainer"));
		//3
		WebElement email3 = driver.findElement(By.cssSelector("input[id=email]"));
		//4
		WebElement email4 = driver.findElement(By.cssSelector("input[id^=em]"));
		WebElement email5 = driver.findElement(By.cssSelector("input[id$=il]"));
		WebElement email6 = driver.findElement(By.cssSelector("input[id*=pa]"));
		// css value
		/*driver.get("https://www.amazon.in/");
		WebElement logo = driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
		System.out.println(logo.getCssValue("font-weight"));
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("font-size"));
		System.out.println(logo.getCssValue("background-color"));
		System.out.println(logo.getCssValue("text-align"));
		System.out.println(logo.getCssValue("font"));*/
		//link and partial link text
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.partialLinkText("Create")).click();*/
		

	}
}
