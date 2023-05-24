package com.example.bth03;

import android.media.Image;

public class Product {
    private int id,price;
    private String name,code,brand,model,description,color;
    private String images;
    ProductList productList;
    public Product(int id, String name, String code, String brand, String model,
                   String description, String color, String images, int price) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.color = color;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    public boolean checkExistedID(){
        Product product = new Product(id,name,code,brand,model,description,color,images,price);
        productList.addProduct(product);
        if(productList.checkDuplicationID(product)){
            productList.removeProduct(product);
            return true;
        }
        else{
            productList.removeProduct(product);
            return false;
        }
    }
}
