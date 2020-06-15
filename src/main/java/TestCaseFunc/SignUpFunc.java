package TestCaseFunc;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpFunc extends BasePage {
    public SignUpFunc(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait wait = new WebDriverWait(driver, 5);

    public By popUpClose = By.cssSelector("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");
    public By accountBtn = By.id("accountBtn");
    public By signUpNowBtn = By.cssSelector("#foorterMain > a");
    public By emailText = By.id("email");
    public By passwordText = By.id("password");
    public By genderMale = By.cssSelector("#registerForm > div.gender > div.gender-type-button-container > a.gender-type-button.man-shoes");
    public By marketingEmailsAuthorized = By.cssSelector("#registerForm > section.marketing-emails > div > label");
    public By memberShipPolicy = By.cssSelector("#registerForm > section.membership-policy > div > label");
    public By signUp = By.linkText("Trendyol'a Üye Olun");

    public void signUp() {

        GenerateMailAddress generateMailAddress = new GenerateMailAddress(driver);
        generateMailAddress.generateMailAddress();

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        if (element(popUpClose).isEnabled()) {
            element(popUpClose).click();
        }
        element(accountBtn).click();
        element(signUpNowBtn).click();
        sendKeys(emailText, email + "@test.com");
        sendKeys(passwordText, password);
        element(genderMale).click();


        executor.executeScript("arguments[0].click();", element(marketingEmailsAuthorized));
        executor.executeScript("arguments[0].click();", element(memberShipPolicy));

        element(signUp).click();
    }
}
