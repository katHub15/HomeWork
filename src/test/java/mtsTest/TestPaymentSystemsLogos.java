package mtsTest;

import base.BaseSelenium;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPaymentSystemsLogos extends BaseSelenium {

    @Test
    public void testPaymentSystemsLogos() {
        mainPage.acceptCookiesIfPresent();

        mainPage.inputNumber(PHONE_NUMBER);
        mainPage.inputSum("10");
        mainPage.clickContinueButton();

        popupPage.switchToFrame();

        List<WebElement> elementsInEmptyFields = popupPage.getTextFromEmptyField();

        assertAll(
                () -> assertTrue(popupPage.getPhoneNumber(PHONE_NUMBER)),
                () -> assertEquals("10.00 BYN", popupPage.getSumText()),
                () -> assertEquals("Оплатить 10.00 BYN", popupPage.getTextByPayButton().trim()),
                () -> assertTrue(popupPage.getCardBrandsImage().isDisplayed()),
                () -> assertEquals("Номер карты", elementsInEmptyFields.get(0).getText()),
                () -> assertEquals("Срок действия", elementsInEmptyFields.get(1).getText()),
                () -> assertEquals("CVC", elementsInEmptyFields.get(2).getText()),
                () -> assertEquals("Имя и фамилия на карте", elementsInEmptyFields.get(3).getText())
        );
    }
}
