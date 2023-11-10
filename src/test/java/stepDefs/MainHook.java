package stepDefs;

import Utilities.ExcelUtility;
import Utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MainHook {
    @Before
    public void before()
    {

    }

    @After
    public void after(Scenario senaryo)
    {
        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/SenaryoSonuclari3.xlsx",
                senaryo);


        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) DriverManager.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        DriverManager.quitDriver();
    }
}
