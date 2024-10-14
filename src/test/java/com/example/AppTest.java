import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

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
     * Setup method to initialize WebDriver.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Set up WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    /**
     * A simple test to verify that the homepage of a website loads successfully.
     */
    public void testHomePage() {
        // Navigate to the desired URL
        driver.get("https://www.example.com");
        
        // Check if the title of the page contains "Example Domain"
        String title = driver.getTitle();
        assertTrue("The title of the page does not match!", title.contains("Example Domain"));
    }

    /**
     * Teardown method to close the browser.
     */
    @Override
    protected void tearDown() throws Exception {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
        super.tearDown();
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
