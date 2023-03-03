import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/elenapopova/IdeaProjects/TestNG/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/ElenaPopova12/ITEA/issues");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
