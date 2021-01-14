package tests;

import model.ComboModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ComboAssert extends TestBase{

    Properties properties;

    @Test
    public void comboAssertTest() throws InterruptedException, IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        List<ComboModel> list = new ArrayList<>();
        ap.getURL("https://telepizza-russia.ru");
        Thread.sleep(4000);
        ap.getNavigationHelper().
                closeBanner(By.cssSelector("div.close.close-desktop-banner"), By.cssSelector("div.content div.close"));
        ap.getNavigationHelper().clickOneElementInList(By.cssSelector("div.navigation div.name"), 10);
        List<WebElement> listElement = ap.driver.findElements(By.xpath("//div[@class='product']"));
        for(int i = 0; i < listElement.size() + 1; i++) {
            if(properties.getProperty("pizza.combo" + i).equals("Комбо Семейный")){
                System.out.println("Opa!!");
                ap.getNavigationHelper().
                        clickElement(By.cssSelector("div div[data-name='" + properties.getProperty("pizza.combo" + i) + "'] a"));
                Thread.sleep(2000);
                ap.getComboHelper().getProduct(By.cssSelector("div.dropdown:nth-child(1)"),
                        By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(2)"));
                ap.getComboHelper().getProduct(By.cssSelector("div.dropdown:nth-child(2)"),
                        By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(3)"));
                ap.getComboHelper().getProduct(By.cssSelector("div.dropdown:nth-child(3)"),
                        By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(2)"));
                ap.getComboHelper().getProduct(By.cssSelector("div.dropdown:nth-child(4)"),
                        By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(1)"));
                List<WebElement> listProduct = ap.driver.findElements(By.cssSelector("div.dropdown div.label"));
                list.add(new ComboModel().withFirstProduct(listProduct.get(0).getText()).withTwoProduct(listProduct.get(1).getText())
                        .withThreeProduct(listProduct.get(2).getText()).withFourProduct(listProduct.get(3).getText()));
                ap.getNavigationHelper().clickOneElementInList(By.cssSelector("div.navigation div.name"), 10);
                Thread.sleep(1000);
            } else {
                ap.getNavigationHelper().
                        clickElement(By.cssSelector("div div[data-name='" + properties.getProperty("pizza.combo" + i) + "'] a"));
                Thread.sleep(2000);
                ap.getComboHelper().getProduct(By.cssSelector("div.dropdown:nth-child(1)"),
                        By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(1)"));
                ap.getComboHelper().getProduct(By.cssSelector("div.dropdown:nth-child(2)"),
                        By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(3)"));
                List<WebElement> listProduct = ap.driver.findElements(By.cssSelector("div.dropdown div.label"));
                Thread.sleep(1000);
                list.add(new ComboModel().withFirstProduct(listProduct.get(0).getText()).withTwoProduct(listProduct.get(1).getText()));
                ap.getNavigationHelper().clickOneElementInList(By.cssSelector("div.navigation div.name"), 10);
            }
        }
    }
}
