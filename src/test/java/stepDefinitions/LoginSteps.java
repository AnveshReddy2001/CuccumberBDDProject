package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
	WebDriver driver = stepDefinitions.WebDriverManager.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		loginPage.enterEmail("anveshpothireddy@gmail.com");
		loginPage.enterPassword("password@123");
		
	}
	
	@When("I click the login button")
	public void i_click_the_login_button() {
		loginPage.clickLogin();
	}
	
	@Then("I should be redirected to the account dashboard")
	public void i_should_be_redirected_to_the_account_dashboard() {
		String dashboardText = driver.findElement(By.xpath("//h2[text()='My Account']")).getText();
        assert dashboardText.equals("My Account");
        driver.quit();
	}
}
