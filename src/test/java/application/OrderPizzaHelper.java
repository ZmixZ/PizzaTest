package application;

import model.PizzaModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPizzaHelper extends HelperBase{
    ApplicationManager ap;

    public OrderPizzaHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public PizzaModel configAndOrderPizza(String doughType, String sizeType) throws InterruptedException {
        waitingElement(2000); // заменить на экспешн кондишн
        waitingElement(1000);
        click(By.xpath("//div[@class='dough']"));
        waitingElement(3000); // заменить на ЭксепшнКондишн (ожидание)
        click(By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(" + doughType +")"));
        waitingElement(2000);
        click(By.xpath("//div[@data-index='" + sizeType + "']"));
        ap.driver.findElement(By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(2)"));
        PizzaModel pizzaModelByOrder = new PizzaModel();
        pizzaModelByOrder.
                withMoney(ap.driver.findElement(By.cssSelector("div[data-id='de00686e-4e6a-40b4-8c2c-a2e061d976bf'] span")).getText());

        click(By.xpath("//div[@data-id='de00686e-4e6a-40b4-8c2c-a2e061d976bf']"));
        click(By.xpath("//div[text()='В корзину']"));
        return pizzaModelByOrder;
    }

    public void findSpecificPizza(String pizzaName) throws InterruptedException {
        click(By.cssSelector("div.search.search-button"));
        type(By.cssSelector("form#search [name='search']"), pizzaName);
        pickKeys(By.cssSelector("form#search [name='search']"), Keys.ENTER);
        waitingElement(1000);
        click(By.cssSelector("div.cross.search-button"));
        click(By.xpath("//div[@data-name='" + pizzaName +"']/a"));
    }

    public void makePizzaDough(String doughType, String sizeType, String sauce) throws InterruptedException {
        click(By.xpath("//div[@class='dough']"));
        waitingElement(1000); // заменить на ЭксепшнКондишн (ожидание)
        click(By.cssSelector("div.dropdown-list div.dropdown-list-element:nth-child(" + doughType + ")"));
        click(By.xpath("//div[./div[@data-index='" + sizeType + "']]"));
        click(By.cssSelector("div.status div.button"));
        click(By.xpath("//label[text()='" + sauce + "']"));
        click(By.cssSelector("div.status div.button"));
    }
}
