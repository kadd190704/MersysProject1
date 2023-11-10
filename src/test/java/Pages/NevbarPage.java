package Pages;

import Utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NevbarPage extends Parent{

    public NevbarPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenShip;










    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "countries": return this.countries;
            case "citizenShip": return this.citizenShip;
           // case "nationalities": return this.nationalities;
            //case "fees": return this.fees;
            //case "entranceExamsOne": return this.entranceExamsOne;
            //case "setupTwo": return this.setupTwo;
            //case "entranceExamsTwo": return this.entranceExamsTwo;
        }

        return null;
    }



}
