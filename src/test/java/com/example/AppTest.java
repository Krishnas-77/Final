import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class AppTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleHomepageTitle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        // Add assertions to validate the title
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
