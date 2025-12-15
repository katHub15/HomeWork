package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTextInEmptyFieldsTest extends BaseSelenium {

    @Test
    public void checkEmptyFieldCommunicationService() {
        mainPage.acceptCookiesIfPresent();

        assertAll(
                () -> assertEquals("Номер телефона", mainPage.getNumberText()),
                () -> assertEquals("Сумма", mainPage.getSumText()),
                () -> assertEquals("E-mail для отправки чека", mainPage.getEmailText())
        );
    }

    @Test
    public void checkEmptyFieldHomeInternet() {
        mainPage.acceptCookiesIfPresent();

        mainPage.selectOperationInDropdown("Домашний интернет");
        assertAll(
                () -> assertEquals("Номер абонента", mainPage.getAbonentPhone()),
                () -> assertEquals("Сумма", mainPage.getSumText()),
                () -> assertEquals("E-mail для отправки чека", mainPage.getEmailText())
        );
    }

    @Test
    public void checkEmptyFieldInstallment() {
        mainPage.acceptCookiesIfPresent();

        mainPage.selectOperationInDropdown("Рассрочка");
        assertAll(
                () -> assertEquals("Номер счета на 44", mainPage.getAccountNumber()),
                () -> assertEquals("Сумма", mainPage.getSumText()),
                () -> assertEquals("E-mail для отправки чека", mainPage.getEmailText())
        );
    }

    @Test
    public void checkEmptyFieldArrears() {
        mainPage.acceptCookiesIfPresent();

        mainPage.selectOperationInDropdown("Задолженность");
        assertAll(
                () -> assertEquals("Номер счета на 2073", mainPage.getArrearsNumberNumber()),
                () -> assertEquals("Сумма", mainPage.getSumText()),
                () -> assertEquals("E-mail для отправки чека", mainPage.getEmailText())
        );
    }
}
