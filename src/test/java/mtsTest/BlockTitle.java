package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlockTitle extends BaseSelenium {

    @Test
    public void blockTitle() {
        acceptCookiesIfPresent();

        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]"));

        assertEquals("Онлайн пополнение\n" + "без комиссии", blockTitle.getText());
    }
}
