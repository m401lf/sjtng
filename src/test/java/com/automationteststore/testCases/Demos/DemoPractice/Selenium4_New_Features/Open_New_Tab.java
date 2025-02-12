package com.automationteststore.testCases.Demos.DemoPractice.Selenium4_New_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Open_New_Tab {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Open and Switch To New Browser Tab
		 * => driver.switchTo().newWindow(WindowType.TAB);
		 * 
		 * Open and Switch To New Browser Window
		 * => driver.switchTo().newWindow(WindowType.WINDOW);
		 */
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//webdrivers//chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com");
		
		Set<String> windowids = driver.getWindowHandles();
		
		String googleId = "";
		String fbId = "";
		String amazonId = "";
		
		for (String id : windowids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains("facebook")) {
				 fbId = id;
			} else if (url.contains("google")) {
				 googleId = id;
			} else {
				amazonId = id;
			}
		}
		
		driver.switchTo().window(amazonId);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12 Pro");
		
	}	
}
