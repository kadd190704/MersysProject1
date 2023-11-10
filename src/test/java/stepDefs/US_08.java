package stepDefs;

import Pages.ContentPage;
import Pages.NevbarPage;
import io.cucumber.java.en.*;

public class US_08 {

    NevbarPage np = new NevbarPage();
    ContentPage cp = new ContentPage();


    @Given("the user is on the Document Types page")
    public void theUserIsOnTheDocumentTypesPage() {
        np.click(np.setup);
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

    }

    @Then("they should be able to edit its name later")
    public void theyShouldBeAbleToEditItsNameLater() {
        cp.click(cp.edit);
        cp.sendKeys(cp.name, "ahmet Taşdelen");
        cp.sendKeys(cp.code, "111");
        cp.click(cp.save);
    }

    @And("they should be able to delete the contact")
    public void theyShouldBeAbleToDeleteTheContact() {
        cp.click(cp.deleteImageBtn);
    }
}
