package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;


public class TokopediaSteps {
    WebDriver driver;
    SearchPage searchPage; 

    @Given("User is on Tokopedia homepage")
    public void user_is_on_tokopedia_homepage() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.tokopedia.com/");
        searchPage = new SearchPage(driver);
    }
    @When("User enters {string} in search box")
    public void user_enters_in_search_box(String product) {
        searchPage.enterSearch(product);
    }

    @And("User presses Enter")
    public void user_presses_enter() {
        searchPage.pressEnter();
        
    }

    @Then("Search results for {string} are displayed")
    public void search_results_for_are_displayed(String product) {
        driver.quit();
    }

}
