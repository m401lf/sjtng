package testCases.Demos.DemoPractice.Selenium_WebDriver_Basic.WebDriverInterface;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;


public class findElementsby_R {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","F:\\Selenium Project\\Downloads\\chromedriver.exe");
        //driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @Test
    public void findElements() throws Exception {
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        List<WebElement> linklist = driver.findElements(By.tagName("a")); // Save the elements in the list with the help List_Scream findElements
        System.out.println("Total No. Of Links = " + linklist.size());


        for (int i = 1; i < linklist.size(); i = i + 1) {

            System.out.println(linklist.get(i).getText());
            System.out.println("************************************");

        }
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();

    }
}
