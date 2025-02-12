package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_13_PartialLinkTextLocatorCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose of PartiallinkTest() is to find the link of UI element from the webpage
        // It does not have any id attribute or others and it's tag name is start with
        // <a> and closed with </a> anchor tag
        driver.findElement(By.partialLinkText("automatedtester")).click();

        Thread.sleep(2000);
        driver.quit();

    }

}
