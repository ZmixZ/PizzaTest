package application;

import org.openqa.selenium.*;

import java.util.List;

public class HelperBase {
    private WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void pickKeys(By locator, Keys keys) {
        driver.findElement(locator).sendKeys(keys);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void waitingElement(int i) throws InterruptedException {
        Thread.sleep(i);
    }
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void clickOneElementInList(By locator, int itemOrder) {
        List<WebElement> list = driver.findElements(locator);
        list.get(itemOrder).click();
    }
}
