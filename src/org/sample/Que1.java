package org.sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get(" http://output.jsbin.com/osebed/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> dropdown = driver.findElements(By.id("fruits"));
		int s = dropdown.size();
		//iterating 
		for (int i = 0; i <dropdown.size() ; i++) {
			if (dropdown.get(i).getText().equals("Apple")) {
				dropdown.get(i).click();
			}
		}
	}

}
