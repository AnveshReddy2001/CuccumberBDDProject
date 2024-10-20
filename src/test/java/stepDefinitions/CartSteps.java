package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;

public class CartSteps {
    WebDriver driver = WebDriverManager.getDriver();
    CartPage cartPage = new CartPage(driver);

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {
        cartPage.addToCart();
    }

    @Then("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        String cartTotal = cartPage.getCartTotal();
        Assert.assertTrue(cartTotal.contains("1 item"), "Product was not added to the cart.");
    }

    @When("I remove the product from the cart")
    public void i_remove_the_product_from_the_cart() {
        cartPage.removeFromCart();
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() {
        String cartTotal = cartPage.getCartTotal();
        Assert.assertTrue(cartTotal.contains("0 item(s)"), "The cart is not empty.");
    }
}
