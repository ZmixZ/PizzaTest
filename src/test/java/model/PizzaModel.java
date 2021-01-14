package model;

public class PizzaModel {

    String money;
    String doughType;
    String size;
    String boardModificator;


    public String getMoney() {
        return money;
    }

    public PizzaModel withMoney(String money) {
        this.money = money;
        return this;
    }

    public String getDoughType() {
        return doughType;
    }

    public PizzaModel withDoughType(String doughType) {
        this.doughType = doughType;
        return this;
    }

    public String getSize() {
        return size;
    }

    public PizzaModel setSize(String size) {
        this.size = size;
        return this;
    }

    public String getBoardModificator() {
        return boardModificator;
    }

    public PizzaModel withBoardModificator(String boardModificator) {
        this.boardModificator = boardModificator;
        return this;
    }
}
