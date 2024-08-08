package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

public class Video_31_findElementsCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getLocation() command is used to get the X and Y coordinate of a webElement from the webPage
        List<WebElement> allbuttons = driver.findElements(By.tagName("button"));
        int totalbutton = allbuttons.size();
        System.out.println("Total number of button tags are avilable on the page is: " + totalbutton);

        for (WebElement element : allbuttons) {
            System.out.println(element.getText());
        }


        Thread.sleep(2000);
        driver.quit();

    }

}
