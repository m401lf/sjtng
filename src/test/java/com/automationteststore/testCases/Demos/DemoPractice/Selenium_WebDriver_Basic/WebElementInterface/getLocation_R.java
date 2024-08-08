package testCases.Demos.DemoPractice.Selenium_WebDriver_Basic.WebElementInterface;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class getLocation_R {
    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","F:\\Selenium Project\\Downloads\\chromedriver.exe");
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void findElements() throws Exception {
        driver.get("https://www.google.com");
        WebElement Search_Button = driver.findElement(By.name("btnK"));
        int X_Coordinate = Search_Button.getLocation().x;
        System.out.println("X-Coordinate List_Scream Search button :- " + X_Coordinate);
        //------------------------------------------------------------------------------//
        int Y_Coordinate = Search_Button.getLocation().y;
        System.out.println("Y-Coordinate List_Scream Search button :- " + Y_Coordinate);
        //------------------------------------------------------------------------------//
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
