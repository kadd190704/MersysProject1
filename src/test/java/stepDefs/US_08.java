package stepDefs;

import Pages.ContentPage;
import Pages.NavbarPage;
import io.cucumber.java.en.*;

public class US_08 {

    NavbarPage np = new NavbarPage();
    ContentPage cp = new ContentPage();


    @Given("the user is on the Document Types page")
    public void theUserIsOnTheDocumentTypesPage() {
        np.click(np.getWebElement("setup"));
        np.click(np.schoolsetup);
        np.click(np.departments);
    }

    @When("the user creates a new Citizenship document")
    public void theUserCreatesANewCitizenshipDocument() {
        cp.click(cp.a);
        cp.click(cp.addButton);
        cp.sendKeys(cp.name, "ahmet");
        cp.sendKeys(cp.code, "11");
        cp.click(cp.save);
        cp.click(cp.a);
    }

    @Then("they should be able to edit its name later")
    public void theyShouldBeAbleToEditItsNameLater() {
        cp.click(cp.edit);
        cp.sendKeys(cp.name, "ahmet ali");
        cp.sendKeys(cp.code, "111");
        cp.click(cp.save);
    }

    @And("they should be able to delete the contact")
    public void theyShouldBeAbleToDeleteTheContact() {
        cp.click(cp.deleteImageBtn);
    }
}
