package com.automationteststore.testCases.Demos.DemoPractice.Selenium4_New_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimizing_Browser_Window {

	public static void main(String[] args) throws Throwable {
		
		/*
		 * Minimize the browser window
		 * 
		 */
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//webdrivers//chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().minimize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
