package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By emailField = By.id("input-email");
	By passwordField = By.id("input-password");
	By loginButton = By.xpath("//input[@value = 'Login']");
	
	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
		
	}
}
