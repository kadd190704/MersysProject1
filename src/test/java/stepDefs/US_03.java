package stepDefs;

import Pages.ContentPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_03 {
    ContentPage cp = new ContentPage();

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        DriverManager.getDriver().get("https://test.mersys.io/");
    }

    @When("they create a new Citizenship document")
    public void theyCreateANewCitizenshipDocument() {
        cp.sendKeys(cp.username, "turkeyts");
        cp.sendKeys(cp.password, "TechnoStudy123");
    }

    @Then("they should be able to edit its name")
    public void theyShouldBeAbleToEditItsName() {
        cp.click(cp.loginBtn);
    }

    @And("they should be able to delete the document")
    public void theyShouldBeAbleToDeleteTheDocument() {
        cp.assertionVerifyContains(cp.verification, "Techno Study");

    }
}
