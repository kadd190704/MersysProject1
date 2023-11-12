package stepDefs;

import Pages.ContentPage;
import Pages.NavbarPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US_07 {

    NavbarPage np = new NavbarPage();
    ContentPage cp = new ContentPage();

    @Given("User logs in as an administrator")
    public void userLogsInAsAnAdministrator() {
        DriverManager.getDriver().get("https://test.mersys.io/");
        cp.sendKeys(cp.username, "turkeyts");
        cp.sendKeys(cp.password, "TechnoStudy123");
        cp.click(cp.loginBtn);

    }
    @And("goes to the School Locations tab")
    public void goesToTheSchoolLocationsTab() {
        np.click(np.getWebElement("setup"));
        np.click(np.schoolsetup);
        np.click(np.locations);

    }
    @And("adds a new School Location")
    public void addsANewSchoolLocation() {
        cp.click(cp.addButton);
        cp.sendKeys(cp.name, "ahmet");
        cp.sendKeys(cp.shortN, "yılmaz");
        cp.sendKeys(cp.numeric,  "1");
        cp.click(cp.buttonmax);
        cp.click(cp.save);
        cp.click(cp.addButton);

    }
    @And("edits the School Location information")
    public void editsTheSchoolLocationInformation() {
        cp.click(cp.edit);
        cp.sendKeys(cp.name, "ahmet ali");
        cp.sendKeys(cp.shortN, "yılmazz");
        cp.sendKeys(cp.numeric,  "11");
        cp.click(cp.buttonmax);
        cp.click(cp.save);
    }
    @Then("the System updates the information and displays a success message")
    public void theSystemUpdatesTheInformationAndDisplaysASuccessMessage() {
        cp.click(cp.deleteImageBtn);
    }


}
