package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDetailsLink extends BaseSelenium {

    @Test
    public void testDetailsLink() {
        WebElement detailsService = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));

        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                detailsService.getAttribute("href")
        );
    }
}
