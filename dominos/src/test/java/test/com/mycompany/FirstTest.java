/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class FirstTest {
    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;
    public FirstTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    
    @Test
  public void testMenuTestCase() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();    
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/div/div[2]/a")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js.executeScript("window.scrollTo(0, 250)");
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[12]/div/a/img")).click(); //prb line
    driver.findElement(By.xpath("//*[@id=\"Carryout\"]")).click();   
    driver.findElement(By.id("City")).click();   
    driver.findElement(By.id("City")).clear();
    driver.findElement(By.id("City")).sendKeys("Palatine");
    driver.findElement(By.id("Region")).click();
    new Select(driver.findElement(By.id("Region"))).selectByVisibleText("IL");
    driver.findElement(By.xpath(" //*[@id=\"PostalCode\"]")).clear();
    driver.findElement(By.className("css-14js2j3")).click();
    driver.findElement(By.xpath("//*[@id=\"locationsResultsPage\"]/div/div[2]/div[2]/div[3]/div/div[2]/div[2]/a/span[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"pageModal\"]/div/section/div/div/ol/div/div/button[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"js-myOrderPage\"]/a")).click(); 
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genericOverlay\"]/section/div/div[2]/div/a")));
    driver.findElement(By.xpath("//*[@id=\"genericOverlay\"]/section/div/div[2]/div/a")).click();
    driver.findElement(By.xpath("//*[@id=\"js-checkoutColumns\"]/aside/div[4]/div[1]/a")).click();  
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_dpz\"]/div[1]/section/div/div/div[2]/button")));
    driver.findElement(By.xpath("//*[@id=\"_dpz\"]/div[1]/section/div/div/div[2]/button")).click();

  }
}
  
