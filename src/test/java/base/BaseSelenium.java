package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseSelenium {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static final String BASE_URL = "https://www.mts.by";
    protected final String PHONE_NUMBER = "297777777";

    @BeforeAll
    static void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get(BASE_URL);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    protected void acceptCookiesIfPresent() {
        WebElement acceptCoockies = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        if (driver.findElement(By.xpath("//button[@id='cookie-agree']")).isDisplayed()) {
            acceptCoockies.click();
        } else {
            System.out.println("Модальное окно не появилось");
        }
    }
}
