/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cashregister;

/**
 *
 * @author abbas
 */
public class ProductInfo {
   
    Product[] products = new Product[5];
    
    static Product prod1 = new Product("111111","Laptop",255.52);
    static Product prod2 = new Product("222222","Nvidia 3080",1200.35);
    static Product prod3 = new Product("333333","Cocacola",2.00);
    static Product prod4 = new Product("444444","Iphone X",800.00);
    static Product prod5 = new Product("555555","Playstation 5",599.99);
    
 
    public static String getName(String upc){
        String name;
        
        if (upc.equals(prod1.getUPC()))
            name = prod1.getName();
        else if (upc.equals(prod2.getUPC()))
            name = prod2.getName();
        else if (upc.equals(prod3.getUPC()))
            name = prod3.getName();
        else if (upc.equals(prod4.getUPC()))
            name = prod4.getName();
        else if (upc.equals(prod5.getUPC()))
            name = prod5.getName();
        else {
            name = "Not found";
        }
            
        return name;
    }
    
    public static double getPrice(String upc){
        
        double price;
        
        if (upc.equals(prod1.getUPC()))
            price = prod1.getPrice();
        else if (upc.equals(prod2.getUPC()))
            price = prod2.getPrice();
        else if (upc.equals(prod3.getUPC()))
            price = prod3.getPrice();
        else if (upc.equals(prod4.getUPC()))
            price = prod4.getPrice();
        else if (upc.equals(prod5.getUPC()))
            price = prod5.getPrice();
        else {
            price = 00.00;
        }
                
        return price;
    }
     
}
