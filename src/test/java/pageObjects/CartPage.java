package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public CartPage(WebDriver driver) {
	
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	By addToCartButton = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]");
    By cartTotal = By.id("cart-total");
    By cartButton = By.id("cart");
    By removeButton = By.xpath("//button[@title='Remove']");
    
    
    public void addToCart() {
    	WebElement addToCartBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartBtn);
    	wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
    }
    
    public String getCartTotal() {
    	WebElement cartTotalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartTotal));
    	return cartTotalElement.getText();
    }
    
    public void removeFromCart() {
    	WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(cartButton));
    	cartBtn.click();
    	WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(removeButton));
    	removeBtn.click();
    }
	
	
	
	

}
