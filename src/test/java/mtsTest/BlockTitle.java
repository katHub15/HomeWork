package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlockTitle extends BaseSelenium {

    @Test
    public void blockTitle() {
        mainPage.acceptCookiesIfPresent();

        assertEquals("Онлайн пополнение\n" + "без комиссии", mainPage.getBlockTitleText());
    }
}

