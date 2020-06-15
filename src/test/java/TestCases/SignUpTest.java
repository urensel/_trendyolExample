package TestCases;

import Listener.Listener;
import TestCaseFunc.SignUpFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class SignUpTest extends BaseTest {

    @Test
    public void signUp() {
        SignUpFunc signUpFunc = new SignUpFunc(driver);
        signUpFunc.signUp();
    }

}
