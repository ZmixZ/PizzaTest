package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    private String browser;
    private OrderPizzaHelper orderPizzaHelper;
    private ConstructorPizzaHelper constructorPizzaHelper;
    private NavigationHelper navigationHelper;
    private ComboHelper comboHelper;

    public ApplicationManager(String browser){
        this.browser = browser;
    }

    public void getURL(String url) {
        driver.get(url);
    }

    public void start() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        constructorPizzaHelper = new ConstructorPizzaHelper(driver, this);
        orderPizzaHelper = new OrderPizzaHelper(driver, this);
        navigationHelper = new NavigationHelper(driver);
        comboHelper = new ComboHelper(driver, this);
    }

    public void stop() {
        driver.quit();
    }

    public ConstructorPizzaHelper getConstructorPizzaHelper() {
        return constructorPizzaHelper;
    }

    public OrderPizzaHelper getOrderPizzaHelper() {
        return orderPizzaHelper;
    }

    public NavigationHelper getNavigationHelper() { return  navigationHelper; }

    public ComboHelper getComboHelper() { return comboHelper; }
}
