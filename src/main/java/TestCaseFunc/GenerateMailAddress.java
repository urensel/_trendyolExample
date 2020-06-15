package TestCaseFunc;

import Utils.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class GenerateMailAddress extends BasePage {

    public GenerateMailAddress(WebDriver driver) {
        super(driver);
    }

    public void generateMailAddress() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();

        email = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }

}
