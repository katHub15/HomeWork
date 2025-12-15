package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestContinueButtonFunctionality extends BaseSelenium {

    @Test
    public void testContinueButtonFunctionality() {
        mainPage.acceptCookiesIfPresent();

        assertAll(
                () -> assertTrue(mainPage.getVisaPayment(), "Логотип виза не отображается"),
                () -> assertTrue(mainPage.getVisaVerifiedPayment(), "Логотип верифайд виза не отображается"),
                () -> assertTrue(mainPage.getMasterCardPayment(), "Логотип мастер карт не отображается"),
                () -> assertTrue(mainPage.getMasterSecurePayment(), "Логотип мастер секьюр карт не отображается"),
                () -> assertTrue(mainPage.getBelcardPayment(), "Логотип белкарт не отображается")
        );
    }
}
