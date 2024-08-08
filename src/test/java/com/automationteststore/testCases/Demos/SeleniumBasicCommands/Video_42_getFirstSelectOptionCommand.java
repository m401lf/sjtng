package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

public class Video_42_getFirstSelectOptionCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getOptions() command is used to retrieve the option value from dropDown and MultiSelect webElement in the webPage

        WebElement dropdown = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdown);
        List<WebElement> dropDownOptions = select.getOptions();
        for (WebElement option : dropDownOptions) {
            System.out.println(option.getText());
        }

        Thread.sleep(1000);

        //MultiSelect Example
        WebElement multiSelect = driver.findElement(By.id("multiselect1"));
        Select select2 = new Select(multiSelect);
        List<WebElement> MultiSelectOptions = select2.getOptions();

        for (WebElement option : MultiSelectOptions) {
            System.out.println(option.getText());
        }


        Thread.sleep(2000);
        driver.quit();

    }

}
