package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupPage extends BasePage {

    public PopupPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String payFrame = "//*[@class='bepaid-iframe']";
    String payButton = "//button[@_ngcontent-ng-c2514714136]";
    String phoneNumberText = "//div[@class='pay-description__text']/span";
    String sumText = "//div[@class='pay-description__cost']/span";
    String inputEmptyFields = "//label[@_ngcontent-ng-c2312288139]";
    String cardBrandsImage = "//div[@class='icons-container ng-tns-c2312288139-2']";


    public void switchToFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(payFrame)));
    }

    public String getTextByPayButton() {
        return getElement(payButton).getText();
    }

    public Boolean getPhoneNumber(String phoneNumber) {
        return wait.until(ExpectedConditions.textToBePresentInElement(getElement(phoneNumberText), phoneNumber));
    }

    public String getSumText() {
        return getElement(sumText).getText();
    }

    public List<WebElement> getTextFromEmptyField() {
        return wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(inputEmptyFields), 4));
    }

    public WebElement getCardBrandsImage() {
        return getElement(cardBrandsImage);
    }
}
