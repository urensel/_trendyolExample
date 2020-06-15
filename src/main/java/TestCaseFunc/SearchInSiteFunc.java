package TestCaseFunc;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchInSiteFunc extends BasePage {

    public SearchInSiteFunc(WebDriver driver) {
        super(driver);
    }

    public By searchBox = By.className("search-box");
    public By sortSelector = By.cssSelector("#search-app > div > div > div.srch-prdcts-cntnr > div.srch-rslt-title > div.sort-fltr-cntnr > select > option:nth-child(2)");
    public By selectProduct = By.className("p-card-img-wr");
    public By addToCard = By.xpath("//div[@class='add-to-bs-tx']");
    public By myBasketListItem = By.id("myBasketListItem");
    public By btnBasketCheckoutButton = By.xpath("//a[@class='btn Basket_CheckoutButton']");

    public void searchInSite() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        if (element(popUpClose).isEnabled()) {
            element(popUpClose).click();
        }

        sendKeys(searchBox, "medikal maske");
        sendKeys(searchBox, String.valueOf(Keys.ENTER));
        element(sortSelector).click();
        Thread.sleep(500);
        list(selectProduct).get(0).click();
        element(addToCard).click();
        element(myBasketListItem).click();
        element(btnBasketCheckoutButton).click();
    }
}
