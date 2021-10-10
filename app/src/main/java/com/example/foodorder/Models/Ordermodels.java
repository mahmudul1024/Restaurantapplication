package com.example.foodorder.Models;

public class Ordermodels {


    int orderImage;
    String soldItemName,price,ordernumber;


    public Ordermodels(int orderImage, String soldItemName, String price, String ordernumber){
        this.orderImage=orderImage;
        this.soldItemName=soldItemName;
        this.price=price;
        this.ordernumber=ordernumber;
    }

    public int getOrderImage(){
        return orderImage;
    }

    public void setOrderImage(int orderImage){
        this.orderImage=orderImage;
    }

    public String getSoldItemName(){
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName){
        this.soldItemName=soldItemName;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price=price;
    }

    public String getOrdernumber(){
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber){
        this.ordernumber=ordernumber;
    }
}
