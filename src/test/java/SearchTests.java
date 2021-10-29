import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "iPhone 11";
    private static final String SEARCH_QUERY = "query=iPhone";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWorld() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkThatSearchResultContainsSearchWorld(){
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        for (WebElement element : getSearchResultsPage().getSearchResultsList()){
            assertTrue(element.getText().contains(SEARCH_KEYWORD));
        }
    }


}
