package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Then;

import org.openqa.selenium.Keys;

public class SearchPage {

    WebDriver driver;

    By searchBox = By.xpath("//input[@aria-label='Cari di Tokopedia']");
    By firstProduct = By.xpath("(//div[@data-testid='CPMProductItem']//img)[1]");
    By addToCartButton = By.xpath("//button[@data-testid='pdpBtnNormalPrimary']");
    
    public SearchPage(WebDriver driver) {

       this.driver = driver;

    }
    

    public void enterSearch(String product){
        driver.findElement(searchBox).sendKeys(product);
    }

    public void pressEnter(){
        WebElement searchField =  driver.findElement(searchBox);
        searchField.sendKeys(Keys.ENTER);

      
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(firstProduct));
    }

    public void clickFirstProduct(){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
        product.click();
    }

    public void addToCart(){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));
        WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        cartButton.click();
    }

   
}
