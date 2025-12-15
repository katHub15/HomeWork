package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static String DETAILS_BUTTON_LINK = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

    String blockTitle = "//h2[contains(text(), 'Онлайн пополнение ')]";
    String visa = "//img[@alt='Visa']";
    String verifiedByVisa = "//img[@alt='Verified By Visa']";
    String masterCard = "//img[@alt='MasterCard']";
    String masterSecureCode = "//img[@alt='MasterCard Secure Code']";
    String belkart = "//img[@alt='Белкарт']";
    String detailsService = "//a[text() = 'Подробнее о сервисе']";
    String phoneInput = "//input[@id='connection-phone']";
    String abonentPhone = "//input[@id='internet-phone']";
    String sumInput = "//input[@id='connection-sum']";
    String continueButton = "//button[text()='Продолжить']";
    String coockie = "//button[@id='cookie-agree']";
    String dropdownButton = "//button[@class='select__header']";
    String emailInput = "//input[@id='internet-email']";
    String accountNumber = "//input[@id='score-instalment']";
    String arrearsNumber = "//input[@id='score-arrears']";

    public String getBlockTitleText() {
        return getElement(blockTitle).getText();
    }

    public boolean getVisaPayment() {
        return getElement(visa).isDisplayed();
    }

    public boolean getVisaVerifiedPayment() {
        return getElement(verifiedByVisa).isDisplayed();
    }

    public boolean getMasterCardPayment() {
        return getElement(masterCard).isDisplayed();
    }

    public boolean getMasterSecurePayment() {
        return getElement(masterSecureCode).isDisplayed();
    }

    public boolean getBelcardPayment() {
        return getElement(belkart).isDisplayed();
    }

    public String getDetailsLink() {
        return getElement(detailsService).getAttribute("href");
    }

    public void inputNumber(String number) {
        getElement(phoneInput).sendKeys(number);
    }

    public void inputSum(String sum) {
        getElement(sumInput).sendKeys(sum);
    }

    public void clickContinueButton() {
        getElement(continueButton).click();
    }

    public void acceptCookiesIfPresent() {
        try {
            getElement(coockie).click();
        } catch (NoSuchElementException  | ElementNotInteractableException e){
            System.out.println("Модальное окно не появилось");
        }
    }

    public void selectOperationInDropdown(String operation) {
        getElement(dropdownButton).click();
        driver.findElement(By.xpath(String.format("//p[text() = '%s']", operation))).click();
    }

    public String getNumberText() {
        return getElement(phoneInput).getAttribute("placeHolder");
    }

    public String getSumText() {
        return getElement(sumInput).getAttribute("placeHolder");
    }

    public String getEmailText() {
        return getElement(emailInput).getAttribute("placeHolder");
    }

    public String getAbonentPhone() {
        return getElement(abonentPhone).getAttribute("placeHolder");
    }

    public String getAccountNumber() {
        return getElement(accountNumber).getAttribute("placeHolder");
    }

    public String getArrearsNumberNumber() {
        return getElement(arrearsNumber).getAttribute("placeHolder");
    }
}