package com.wit.store_main;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] sales = new ProductForSale[5];

        sales[0] = new Chocolate("Ritter Sport", 50, "White Chocolate", 50,"Kare");
        sales[1] = new Coke("Coca Cola", 25, "Drink Cold!", true);
        sales[2] = new Bread("Pofuduk", 5, "Çiçek Ekmek", false, "Çiçek");

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {

        if (products != null) {

            for (ProductForSale product : products) {

                if (product != null) {

                    product.showDetails();

                }

            }

        } else {

            System.out.println("Products can't be null!");
        }

    }
}
