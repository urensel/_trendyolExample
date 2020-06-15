package TestCases;

import Listener.Listener;
import TestCaseFunc.SearchInSiteFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class SearchInSiteTest extends BaseTest {
    @Test
    public void searchInSite() throws InterruptedException {
        SearchInSiteFunc searchInSiteFunc = new SearchInSiteFunc(driver);
        searchInSiteFunc.searchInSite();
    }
}
