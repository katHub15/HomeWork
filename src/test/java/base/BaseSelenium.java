package base;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.MainPage;
import pageObject.PopupPage;


public class BaseSelenium {

    protected static WebDriver driver = WebDriverManager.chromedriver().create();
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    protected static final String BASE_URL = "https://www.mts.by";
    protected final String PHONE_NUMBER = "297777777";
    protected static MainPage mainPage = new MainPage(driver, wait);
    protected static PopupPage popupPage = new PopupPage(driver, wait);

    @BeforeAll
    static void setUp() {
        driver.get(BASE_URL);
    }
}

