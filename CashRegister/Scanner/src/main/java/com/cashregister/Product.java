/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cashregister;

/**
 *
 * @author abbas
 */
public class Product {
    
    //declare variables
    String productName;
    double productPrice;
    String upc;
    
    //constructor 
    Product (String upc, String productName, double productPrice){
        this.upc = upc;
        this.productName = productName;
        this.productPrice = productPrice;
    }
   
    // get statements for each variable of object
    String getUPC(){
        return upc;
    }
    
    String getName(){
        return productName;
    }
    
    double getPrice(){
        return productPrice;
    }
    
}
