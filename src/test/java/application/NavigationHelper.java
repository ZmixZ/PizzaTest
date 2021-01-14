package application;

import model.PizzaModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void clickElement(By locator) {
        click(locator);
    }

    public void resultAssertEquals(PizzaModel pz1, PizzaModel pz2){
        String [] split1 = pz1.getMoney().split(" ");
        String [] split2 = pz2.getMoney().split(" ");
        pz1.withMoney(split1[0]);
        pz2.withMoney(split2[0]);
        int priceOrder = Integer.parseInt(pz1.getMoney());
        int priceCustom = Integer.parseInt(pz2.getMoney());
        if(priceCustom == priceOrder) {
            System.out.println("Цена кастомной пиццы эквивалентна пиццы из меню");
        } else {
            System.out.println("Цена кастомной пиццы отличается от пиццы из меню");
        }
        Assert.assertEquals(priceOrder, priceCustom);
    }

    public void goToTheBasket(By xpath, String s) {
        click(xpath);
        click(By.cssSelector(s));
    }

    public void closeBanner(By locator1, By locator2) {
        click(locator1);
        click(locator2);
    }

}
