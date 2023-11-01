package com.wit.store_main;

public abstract class ProductForSale {

private String type;
private double price;
private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public double getSalesPrice(int quantity){

        return quantity*price;
    }
    public abstract void showDetails ();
    @Override
    public String toString() {

        StringBuilder sbPFS = new StringBuilder();
        sbPFS.append("----------- Products For Sale -----------\n");
        sbPFS.append("Type: "+type + "\n");
        sbPFS.append("Price: " + price + "\n");
        sbPFS.append("Description: " + description+"\n");
        sbPFS.append("Class Name: " + getClass().getSimpleName()+"\n");
        return sbPFS.toString();
    }
}
