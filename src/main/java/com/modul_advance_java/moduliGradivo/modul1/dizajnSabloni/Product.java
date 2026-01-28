package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni;

public class Product {

    private String brand;
    private String model;
    private double price;


    public Product(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

    }

    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Product() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
