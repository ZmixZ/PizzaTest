package model;

public class ComboModel {

    String firstProduct;
    String twoProduct;
    String threeProduct;
    String fourProduct;

    public String getFirstProduct() {
        return firstProduct;
    }

    public ComboModel withFirstProduct(String firstProduct) {
        this.firstProduct = firstProduct;
        return this;
    }

    public String getTwoProduct() {
        return twoProduct;
    }

    public ComboModel withTwoProduct(String twoProduct) {
        this.twoProduct = twoProduct;
        return this;
    }

    public String getThreeProduct() {
        return threeProduct;
    }

    public ComboModel withThreeProduct(String threeProduct) {
        this.threeProduct = threeProduct;
        return this;
    }

    public String getFourProduct() {
        return fourProduct;
    }

    public ComboModel withFourProduct(String fourProduct) {
        this.fourProduct = fourProduct;
        return this;
    }
}
