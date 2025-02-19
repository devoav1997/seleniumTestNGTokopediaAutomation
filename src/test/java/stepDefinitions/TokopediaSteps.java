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

    @And("User clicks on the first product")
    public void user_clicks_on_the_first_product() {
        searchPage.clickFirstProduct();
    }
    
    @And("User adds the product to cart")
    public void user_adds_the_product_to_cart() {
        searchPage.addToCart();
    }

    @Then("Product should be added to cart successfully")
    public void product_should_be_added_to_cart_successfully() {
        try {
            Thread.sleep(5000); // Delay 3 detik setelah Enter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }



}
