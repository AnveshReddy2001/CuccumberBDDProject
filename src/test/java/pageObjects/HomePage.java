package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By header = By.cssSelector("header");
	By footer = By.cssSelector("footer");
	
	public boolean isHeaderDispalyed() {
		return driver.findElement(header).isDisplayed();
	}
	
	public boolean isFooterDisplayed() {
		return driver.findElement(footer).isDisplayed();
	}
	
}
