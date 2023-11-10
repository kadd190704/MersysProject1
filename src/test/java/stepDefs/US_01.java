package stepDefs;

import Pages.NavbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_01 {

    NavbarPage np=new NavbarPage();

    @And("Navigate to Position Categories")
    public void navigateToPositionCategories() {
        np.click(np.humanResources);
        np.click(np.setup);
        np.click(np.positionCategories);
    }

    @When("Create a New Position Category")
    public void createANewPositionCategory() {
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }

    @When("User delete the {string}")
    public void userDeleteThe(String arg0) {
    }
}
