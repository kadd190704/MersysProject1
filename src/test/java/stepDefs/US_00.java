package stepDefs;

import Pages.ContentPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_00 {

    ContentPage cp=new ContentPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        DriverManager.getDriver().get("https://test.mersys.io/");
    }

    @When("the user enters the valid username and password")
    public void theUserEntersTheValidUsernameAndPassword() {
        cp.sendKeys(cp.username,"turkeyts");
        cp.sendKeys(cp.password,"TechnoStudy123");
    }
    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        cp.click(cp.loginBtn);
    }

    @Then("the user should be successfully logged into the system")
    public void theUserShouldBeSuccessfullyLoggedIntoTheSystem() {
        cp.assertionVerifyContains(cp.verification,"Techno Study");
    }
}
