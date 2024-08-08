package com.automationteststore.testCases.Demos.DemoPractice.Selenium_WebDriver_Basic.OtherWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class windowhandles_W {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void testSwitchwindow() throws Exception {
        driver.get("http://localhost/whizTrial/");
        //driver.manage().window().maximize();
        driver.get("http://localhost/whizTrial/index.php");
        driver.findElement(By.id("Lid")).clear();
        driver.findElement(By.id("Lid")).sendKeys("gsahai");
        driver.findElement(By.id("Lpwd")).clear();
        driver.findElement(By.id("Lpwd")).sendKeys("pass123");
        driver.findElement(By.cssSelector("input#Lsub")).click();
        driver.findElement(By.xpath(".//*[@id='popup']")).click();
        Thread.sleep(3000);
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);

        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='Nw']")).click();
        Assert.assertEquals(driver.getTitle(), "BookMyInterview.in");
        //Thread.sleep(3000);

        Thread.sleep(2000);
        //driver.switchTo().window(mainwindow);
        //Assert.assertEquals(driver.getTitle(),"WhizTrial Welcome");
        Thread.sleep(2000);
    
   /* Set<String> AllWindowHandles = driver.getWindowHandles();
    int n = AllWindowHandles.size();
    System.out.println("Total window open : " + n + "\n");
    int i,j;
    
    for (i=0; i<n; i++){
    	j = i+1;
    	System.out.println("Window No : " + j);
    	System.out.println("Handle : " + (String) AllWindowHandles.toArray()[i] +"\n");
    }
    
    for(String winHandle : driver.getWindowHandles()){
    	System.out.println(" Win Handle : " + winHandle);
    	driver.switchTo().window(winHandle);
    	Thread.sleep(3000);
    }
     
    Assert.assertEquals(driver.getTitle(),"BookMyInterview.in");*/
     
    /*Thread.sleep(2000);
    driver.switchTo().window(mainwindow);
    Assert.assertEquals(driver.getTitle(),"WhizTrial Welcome");
    Thread.sleep(2000);*/


    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}

