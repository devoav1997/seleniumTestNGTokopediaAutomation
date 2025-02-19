package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

import org.openqa.selenium.Keys;

public class SearchPage {

    WebDriver driver;

    By searchBox = By.xpath("//input[@aria-label='Cari di Tokopedia']");
    
    public SearchPage(WebDriver driver) {

       this.driver = driver;

    }
    

    public void enterSearch(String product){
        driver.findElement(searchBox).sendKeys(product);
    }

    public void pressEnter(){
        WebElement searchField =  driver.findElement(searchBox);
        searchField.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(5000); // Delay 3 detik setelah Enter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Search results for {string} are displayed")
    public void search_results_for_are_displayed(String product) {
        driver.quit();
    }
    
}
