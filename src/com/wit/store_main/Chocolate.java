package com.wit.store_main;

public class Chocolate extends ProductForSale {

    private double bitterRate;
    private String shape;
    public Chocolate(String type, double price, String description, double bitterRate,String shape) {
        super(type, price, description);
        this.bitterRate = bitterRate;
        this.shape = shape;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder sbChocolate = new StringBuilder();

        sbChocolate.append("Bitter Rate: " + bitterRate + "\n");
        sbChocolate.append("Chocolate Shape: " + shape + "\n");
        System.out.println(result + sbChocolate);

    }
}
