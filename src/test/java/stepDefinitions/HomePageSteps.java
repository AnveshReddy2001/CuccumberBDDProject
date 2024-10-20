package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class HomePageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	HomePage homePage = new HomePage(driver);
	
	@Given("I am on the home page")
    public void i_am_on_the_home_page() {
        driver.get("https://naveenautomationlabs.com/opencart/");
    }

    @Then("the header should be displayed")
    public void the_header_should_be_displayed() {
        Assert.assertTrue(homePage.isHeaderDispalyed(), "Header is not displayed.");
    }

    @Then("the footer should be displayed")
    public void the_footer_should_be_displayed() {
        Assert.assertTrue(homePage.isFooterDisplayed(), "Footer is not displayed.");
    }

}
