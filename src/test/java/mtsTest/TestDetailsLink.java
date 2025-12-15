package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pageObject.MainPage.DETAILS_BUTTON_LINK;

public class TestDetailsLink extends BaseSelenium {

    @Test
    public void testDetailsLink() {
        mainPage.acceptCookiesIfPresent();

        assertEquals(DETAILS_BUTTON_LINK,
                mainPage.getDetailsLink()
        );
    }
}
