import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class IssuesPage extends BasePage {
    public IssuesPage(WebDriver driver) {
        super(driver);
    }
    private WebElement buttonNewIssues = driver.findElement
            (By.xpath("//*[@class=\"btn btn-primary\"]"));
    private WebElement pageInformMassege = driver.findElement(By.xpath(
            "//*[contains(text(),'Have a question about this project?')]"));
    private WebElement buttonSearch = driver.findElement(By.id("js-issues-search"));
    public WebElement getPageInformMassege() {
        return pageInformMassege;
    }
    public WebElement getButtonSearch() {
        return buttonSearch;
    }
    public void buttonNewIssues() {
        buttonNewIssues.click();
    }
    public void buttonSearch(String request) {
        buttonSearch.sendKeys();
    }
}
