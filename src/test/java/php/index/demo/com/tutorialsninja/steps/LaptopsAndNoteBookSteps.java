package php.index.demo.com.tutorialsninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import php.index.demo.com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import php.index.demo.com.tutorialsninja.pages.ProductPage;
import php.index.demo.com.tutorialsninja.pages.ShoppingCartPage;

public class LaptopsAndNoteBookSteps {
    @Then("^Verify that products sorted in Descending order$")
    public void verifyThatProductsSortedInDescendingOrder() throws InterruptedException {
        Assert.assertTrue(new LaptopsAndNoteBooksPage().isSorted(),"Products are not sorted");
    }

    @When("^I Change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) {
        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("^I Click on “Update” Tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @Then("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expected) {
        Assert.assertTrue(new ProductPage().getProductAddedSuccessMessage().contains(expected),"Cart is not updated");
    }
}
