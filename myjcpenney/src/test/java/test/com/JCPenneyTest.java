/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author kenmp
 */
public class JCPenneyTest {

    private WebDriver driver;
    private String baseUrl;

    public JCPenneyTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testJCPenneyTestCase() throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        driver.get("https://www.jcpenney.com/");
        driver.findElement(By.id("searchInputId")).click();
        driver.findElement(By.id("searchInputId")).clear();
        driver.findElement(By.id("searchInputId")).sendKeys("suit");
        driver.findElement(By.cssSelector(".typeaheadFocusInputContent")).submit();
        driver.findElement(By.xpath("//img[@alt='JF J. Ferrar® 360 Stretch Slim Fit Suit Jacket']")).click();
        driver.findElement(By.xpath("//div[@id='product-options-false']/div[2]/div/section/ul/li/button")).click();
        driver.findElement(By.xpath("//div[@id='product-options-false']/div[2]/div/section/ul/li/button")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='short'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("//div[@id='GlobalOptions-AddToCart']/button/div/p[2]")).click();
        driver.findElement(By.xpath("//div[@id='atPanelContent']/div/div/section/section/section/div/div/div/div[3]/div[2]/span")).click();
        assertEquals("JF J. Ferrar® 360 Stretch Slim Fit Suit Jacket", driver.findElement(By.xpath("//*[@id=\"atPanelContent\"]/div[1]/div/section/section/section[1]/div[1]/div/div/div[3]/div[2]/span")).getText());

       
        
        Thread.sleep(4000);         // Waits for 4 seconds before closing google browser
        driver.close();             // closes the browser

    }

}
