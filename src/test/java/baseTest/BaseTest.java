package baseTest;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import topUpPage.TopUpPage;

public class BaseTest {


       private WebDriver driver;
        protected TopUpPage thePage;

        @BeforeEach
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.tokopedia.com/top-up-tagihan");
            thePage = new TopUpPage(driver);
        }



}
