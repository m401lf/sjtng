package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_74_GetCookieNameCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.tutorialsninja.com/demo/");

        //getCookieNamed() command to return the information of a particular cookies details
        Cookie cookie = driver.manage().getCookieNamed("OCSESSID");

        System.out.println("Cookie Name:" + cookie.getName());
        System.out.println("Cookie Value:" + cookie.getValue());
        System.out.println("Cookie Domain:" + cookie.getDomain());
        System.out.println("Cookie Path:" + cookie.getPath());
        System.out.println("Cookie Expiray Date:" + cookie.getExpiry());


        Thread.sleep(2000);
        driver.quit();

    }

}
