package com.example.bth03;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private static ArrayList<Product> productList = new ArrayList<>();

    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public static void setProductList(ArrayList<Product> productList) {
        ProductList.productList = productList;
    }
    public static void addProduct(Product p){
        productList.add(p);
    }
    public static void removeProduct(Product p){
        productList.remove(p);
    }
    public static boolean checkDuplicationID(Product productChecking){
        int countID=0;
        for(Product productOnList:productList ){
            if (productOnList.getId()==productChecking.getId()) countID++;
        }
        if (countID>1) return true;
        else return false;
    }

}
