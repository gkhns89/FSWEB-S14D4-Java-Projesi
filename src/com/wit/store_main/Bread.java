package com.wit.store_main;

public class Bread extends ProductForSale{

    private boolean isHaveNuts;

    private String shape;

    public Bread(String type, double price, String description, boolean isHaveNuts, String shape) {
        super(type, price, description);
        this.isHaveNuts = isHaveNuts;
        this.shape = shape;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder sbBread = new StringBuilder();

        sbBread.append("With Nuts: " + isHaveNuts + "\n");
        sbBread.append("Shape: " + shape + "\n");
        System.out.println(result + sbBread);

    }

}
