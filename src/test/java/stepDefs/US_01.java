package stepDefs;

import Pages.ContentPage;
import Pages.NavbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_01 {

    NavbarPage np=new NavbarPage();
    ContentPage cp=new ContentPage();

    @And("Navigate to Position Categories")
    public void navigateToPositionCategories() {
        np.click(np.humanResources);
        np.click(np.setup3);
        np.click(np.positionCategories);
    }

    @When("Create a New Position Category")
    public void createANewPositionCategory() {
     cp.click(cp.addButton);
     cp.sendKeys(cp.name,"Yusuf");
     cp.click(cp.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {


    }
    @And("User must be able to edit Position Categories")
    public void userMustBeAbleToEditPositionCategories() {
        cp.click(cp.editBtn);
        cp.sendKeys(cp.name, "Yusuf2");
        cp.click(cp.saveButton);
    }

    @When("User delete the {string}")
    public void userDeleteThe(String arg0) {
        cp.click(cp.deleteContentBtn);

    }


}
