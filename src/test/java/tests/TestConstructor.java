package tests;

import model.PizzaModel;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestConstructor extends TestBase {

    @Test
    public void testConstructor() throws InterruptedException {
        ap.getURL("https://telepizza-russia.ru");
        ap.getNavigationHelper().
                closeBanner(By.cssSelector("div.content div.close"), By.cssSelector("div.close.close-desktop-banner"));
        ap.getNavigationHelper().clickElement(By.cssSelector("a.constructor.link"));

        ap.getOrderPizzaHelper().
                makePizzaDough("2", "2", "Сливочно-Шпинатный");

        ap.getConstructorPizzaHelper().meatAndSausageClickUp();
        ap.getConstructorPizzaHelper().vegAndMushroomsClickUp();
        ap.getConstructorPizzaHelper().fruitsClickUp();
        ap.getConstructorPizzaHelper().cheeseClickUp();
        ap.getConstructorPizzaHelper().seafoodClickUp();
        ap.getNavigationHelper().clickElement(By.cssSelector("div.reset"));

        PizzaModel pizzaByCustom =
                ap.getConstructorPizzaHelper().customizePizzaLikeAMenuPizza();
        ap.getNavigationHelper().
                goToTheBasket(By.xpath("//div[text()='В корзину']"), "div.pizza div.button");

        ap.getOrderPizzaHelper().findSpecificPizza("Альфредо");

        PizzaModel pizzaByOrder =
                ap.getOrderPizzaHelper().configAndOrderPizza("2", "2");
        ap.getNavigationHelper().clickElement(By.cssSelector("a.cart"));
        ap.getNavigationHelper().resultAssertEquals(pizzaByOrder, pizzaByCustom);
        System.out.println("123");
        System.out.println("new branch inform");

    }

}
