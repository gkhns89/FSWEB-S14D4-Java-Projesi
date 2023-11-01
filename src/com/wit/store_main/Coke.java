package com.wit.store_main;

public class Coke extends ProductForSale {

    private boolean isHaveSugar;

    public Coke(String type, double price, String description, boolean isHaveSugar) {
        super(type, price, description);
        this.isHaveSugar = isHaveSugar;
    }


    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder sbCoke = new StringBuilder();

        sbCoke.append("Diet: " + isHaveSugar + "\n");

        System.out.println(result + sbCoke);

    }
}
