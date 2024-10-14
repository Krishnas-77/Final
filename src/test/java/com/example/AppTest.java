package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    
    private WebDriver driver;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Set up method to initialize WebDriver
     */
    @Override
    protected void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * A sample Selenium test case
     */
    public void testGoogleSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Enter search query
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");

        // Submit the search form
        driver.findElement(By.name("q")).submit();

        // Verify the title of the search results page
        String expectedTitle = "Selenium WebDriver - Google Search";
        assertTrue(driver.getTitle().contains(expectedTitle));
    }

    /**
     * Another sample test case
     */
    public void testPageTitle() {
        // Navigate to a simple webpage
        driver.get("https://krishnas-77.github.io/Exp05/home.html");

        // Verify the title of the page
        String expectedTitle = "Urban Cart";
        assertEquals(expectedTitle, driver.getTitle());
    }

    /**
     * Tear down method to quit WebDriver
     */
    @Override
    protected void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
