package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComboHelper extends HelperBase{
    ApplicationManager ap;

    public ComboHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public void getProduct(By locator, By locator1) throws InterruptedException {
       click(locator);
       Thread.sleep(2000);
       click(locator1);
    }
}
