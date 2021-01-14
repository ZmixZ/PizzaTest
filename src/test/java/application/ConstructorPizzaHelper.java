package application;

import model.PizzaModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConstructorPizzaHelper extends HelperBase{
    ApplicationManager ap;

    public ConstructorPizzaHelper(WebDriver driver, ApplicationManager ap){
        super(driver);
        this.ap = ap;
    }

    public PizzaModel customizePizzaLikeAMenuPizza() {
        click(By.xpath("//div[@data-tab='Мясо и колбасы']"));
        WebElement webElement1 = getAndClickTopping(By.xpath("//div[@data-id='ee90f004-2ab0-47ca-aa53-313e3dbfc91a']"),
                "up");
        WebElement webElement2 = getAndClickTopping(By.xpath("//div[@data-id='25894626-5074-4c23-b27c-f5ca42b2da50']"),
                "up");
        click(By.xpath("//div[@data-tab='Овощи и грибы']"));
        WebElement webElement3 = getAndClickTopping(By.xpath("//div[@data-id='00160deb-f371-4445-bf45-6ca1f7409ca0']"),
                "up");
        WebElement webElement4 = getAndClickTopping(By.xpath("//div[@data-id='dd1785ad-31ea-4104-afd6-9ff95206f69f']"),
                "up");
        click(By.cssSelector("div[data-tab='Сыры']"));
        WebElement webElement5 = getAndClickTopping(By.xpath("//div[@data-id='dba738ef-78db-4b52-8416-2d91555c21c6']"),
                "up");
        PizzaModel pizzaModel = new PizzaModel()
                .withMoney(ap.driver.findElement(By.cssSelector("div.total div.price.accent")).getText());
        return pizzaModel;
    }

    public void seafoodClickUp() {
        click(By.cssSelector("div[data-tab='Морепродукты']"));
        getAndClickTopping(By.xpath("//div[@data-id='2cd3b7c5-cd24-41b1-b5ad-36ac852afb49']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='a588d79b-b307-4c43-ac12-b277d3f53d66']"),
                "up");
    }

    public void cheeseClickUp() {
        click(By.cssSelector("div[data-tab='Сыры']"));
        getAndClickTopping(By.xpath("//div[@data-id='48051eae-b8ba-48f9-9ef1-b733c4928406']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='6a0cdfdd-c951-49fd-971a-dfd89efbc735']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='c34c063a-404d-43a3-92af-11f92b655af0']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='dba738ef-78db-4b52-8416-2d91555c21c6']"),
                "up");
    }

    public void fruitsClickUp() {
        click(By.cssSelector("div[data-tab='Фрукты']"));
        getAndClickTopping(By.xpath("//div[@data-id='2b4db0cb-df84-4b07-be6e-431b2c3a3957']"),
                "up");
    }

    public void vegAndMushroomsClickUp() {
        click(By.xpath("//div[@data-tab='Овощи и грибы']"));
        getAndClickTopping(By.xpath("//div[@data-id='00160deb-f371-4445-bf45-6ca1f7409ca0']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='23af5b60-4cc0-4395-a43f-536d0a87464a']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='3af3a9f4-507c-4503-8f7d-d58f2dcbfaaa']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='674c48a3-d8bd-4fd4-b80d-1106e55a7be4']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='6d71fee3-acae-4569-ab0f-feb307756e3d']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='a1228cba-e170-4fc2-ab2d-05053b565f53']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='bef150ff-308c-40a8-929a-4ea6665557e2']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='c50342e5-a5da-4b97-9a07-7ef5fea5259c']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='db24adc9-da6a-4798-8060-10c6fd1b0de3']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='dd1785ad-31ea-4104-afd6-9ff95206f69f']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='ed1f10f1-6c36-47d4-9058-76fe1f31a200']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='fcc1cad5-4ff0-4cf8-a792-a37038864578']"),
                "up");
    }

    public void meatAndSausageClickUp() {
        click(By.xpath("//div[@data-tab='Мясо и колбасы']"));
        getAndClickTopping(By.xpath("//div[@data-id='0b9b9baa-c755-4a19-ab1c-af9e0c6a435b']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='25894626-5074-4c23-b27c-f5ca42b2da50']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='14f8169a-51a0-4c9a-bce2-2902157f5ce6']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='26e27ea6-4dc3-4f83-8f99-ce2cb0620964']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='55c35813-f95b-4ede-8f8a-099aa1af6439']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='91e7c7a1-29c1-47ce-bd04-ab6891557989']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='b5bcf3da-f8c6-4ede-8063-e52cfcb4290c']"),
                "up");
        getAndClickTopping(By.xpath("//div[@data-id='ee90f004-2ab0-47ca-aa53-313e3dbfc91a']"),
                "up");
    }

    public WebElement getAndClickTopping(By topping, String upORdown){
        WebElement webelement = ap.driver.findElement(topping);
        webelement.findElement(By.cssSelector("div[data-value='" + upORdown + "']")).click();
        return webelement;
    }

}
