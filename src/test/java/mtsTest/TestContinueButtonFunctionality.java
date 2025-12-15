package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContinueButtonFunctionality extends BaseSelenium {

    @Test
    public void testContinueButtonFunctionality() {
        acceptCookiesIfPresent();
        WebElement phoneInput = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumInput = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement continueButton = driver.findElement(By.xpath("//button[text()='Продолжить']"));

        phoneInput.sendKeys(PHONE_NUMBER);
        sumInput.sendKeys("10");
        continueButton.click();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@class='bepaid-iframe']")));
        wait.until(ExpectedConditions.textToBePresentInElement(
                driver.findElement(By.xpath("//div[@class='pay-description__text']/span")),
                PHONE_NUMBER
        ));
        WebElement sumText = driver.findElement(By.xpath("//div[@class='pay-description__cost']/span"));

        assertEquals("10.00 BYN", sumText.getText());

    }
}
