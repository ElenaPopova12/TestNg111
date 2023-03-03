import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    @Test
    public void someCheak() {

        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.buttonNewIssues();
        Assert.assertTrue(issuesPage.getPageInformMassege().isDisplayed());

        Assert.assertEquals("Have a question about this project?",
                issuesPage.getPageInformMassege().getText());
    }
    @DataProvider(name = "dataProvider")
    public Object[][] request() {
        return new Object[][]{
                {"TestNG"},
        };
    }
    @Test(dataProvider = "dataProvider")
    public void verifySearhRequest(String request) {
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.getButtonSearch().clear();
        issuesPage.getButtonSearch().click();
        issuesPage.getButtonSearch().sendKeys(request);
    }
}