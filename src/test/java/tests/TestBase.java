package tests;

import application.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase{
    ApplicationManager ap = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public void init()
    {
        ap.start();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        ap.stop();
    }

}
