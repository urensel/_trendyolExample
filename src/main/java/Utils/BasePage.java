package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public static String email = "testAuto";
    public static String password = "Q1w2e3.4";
    public By popUpClose = By.cssSelector("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");

    public WebElement element(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public List<WebElement> list(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }

    public void sendKeys(By locator, String value){
        element(locator).sendKeys(value);
    }

    public void closePopUp(){
        if(driver.switchTo().activeElement().isEnabled())
        {
            driver.switchTo().activeElement().click();
        }
    }
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }
}
