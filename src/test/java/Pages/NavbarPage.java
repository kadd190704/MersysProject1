package Pages;

import Utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarPage extends Parent{

    public NavbarPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

     @FindBy(xpath = "//span[text()='Human Resources']/parent::a")
     public WebElement humanResources;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    public WebElement setup3;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenShip;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    public WebElement positionCategories;










    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup": return this.setup3;
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
