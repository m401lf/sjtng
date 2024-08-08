package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_77_deleteCookieCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.tutorialsninja.com/demo/");

        //deleteCookie() command to delete a particular/specific cookie in the current session of the browser
        Cookie cookie = driver.manage().getCookieNamed("OCSESSID");

        driver.manage().deleteCookie(cookie);


        Thread.sleep(2000);
        driver.quit();

    }

}
