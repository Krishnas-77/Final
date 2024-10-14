package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        // Set up ChromeDriver path
         System.setProperty("webdriver.chrome.driver", "C:/ProgramData/Jenkins/.jenkins/workspace/SeleniumTest1/src/chromedriver.exe");
         driver = new ChromeDriver();
    }

    /**
     * Simple test to check Google homepage title
     */
    public void testGoogleHomepageTitle() {
        // Open Google homepage
        driver.get("https://www.google.com");

        // Verify that the title contains "Google"
        assertTrue(driver.getTitle().contains("Google"));
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
     * Rigorous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
