package Pages;

import Utilities.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContentPage extends Parent{

    public ContentPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(xpath="//ms-add-button//button")
    public WebElement addButton;
    @FindBy(xpath="//ms-edit-button//button")
    public WebElement editBtn;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement verification;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement name;

    @FindBy(xpath="(//input[@data-placeholder='Name'])[2]")
    public WebElement name2;



    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='shortName']//input" )
    public WebElement ShortName;



    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteContentBtn;





    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "addButton": return this.addButton;
            case "saveButton": return this.saveButton;
           // case "nameInput": return this.nameInput;
            //case "codeInput": return this.codeInput;
           // case "integrationCode": return this.integrationCode;
           // case "priorityCode": return this.priorityCode;
           // case "toggleBar": return this.toggleBar;
           // case "academicPeriod": return this.academicPeriod;
           // case "academicPeriod1": return this.academicPeriod1;
           // case "gradeLevel": return this.gradeLevel;
           // case "gradeLevel2": return this.gradeLevel2;
            //case "searchAcademicPeriod": return this.searchAcademicPeriod;
        }

        return null;
    }


    public void deleteItem(String searchText){
        sendKeys(searchInput, searchText);
        click(searchButton); // fuse bar ı çocukları ortaya çıkıyor

        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
        //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        //wait.until(ExpectedConditions.stalenessOf(dc.deleteImageBtn)); //olabilir ama herzaman çözmez

        //2.yöntem sayfanın kendi waitini , loding ini yakalayalım. (en sağlam yöntem)
        //fuse-progress-bar/*    -> fuse-progress-bar ın çocukları
        // bu çocukların 0 olana bekle
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        click(deleteImageBtn);
        click(deleteContentBtn);

        // silme ıslemı dıalogların ortak noktası olması sebebıyle buraya aldık. Silme islemi yapacagımız her seferınde tekrar tekrar kod yazmayalım dırekt cagıralım dıye aldık.
    }
}
