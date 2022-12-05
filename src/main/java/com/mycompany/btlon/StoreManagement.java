/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author loctp
 */
public class StoreManagement {
    private List<Product> productsList = new ArrayList<>();
    private List<AddDiscount> addDiscountList = new ArrayList<>();
    private List<Discount> discountList = new ArrayList<>();


    public void addDiscount(Discount a, Product b) {
        this.getAddDiscountList().add(new AddDiscount(a, b));
        b.addDiscount(a);
    }

    public void removeDiscountOutDate (){
        for (int i = 0; i < this.productsList.size(); i++) {
            this.productsList.get(i).removeDiscountOutDate();
        }
        for (int i = 0; i < this.addDiscountList.size(); i++) {
            if(this.addDiscountList.get(i).getDc().isOutDate()<0) this.addDiscountList.remove(this.addDiscountList.get(i));
        }
    }

    //method discount
    public void addDiscount (Discount a){
        this.discountList.add(a);
    }

    public Discount searchByNameDis(String nameDis) {
        return this.getAddDiscountList().stream().filter(AddDiscount -> AddDiscount.getDc().getIdDiscount().equals(nameDis)).findFirst().orElse(null).getDc();
    }

    //mehod product
    public void addProd(Product sp) {
        this.getProductsList().add(sp);
    }
    public Product searchByName(String nameProd) {
        return this.getProductsList().stream().filter(Products -> Products.getNameProd().equals(nameProd)).findFirst().orElse(null);
    }

    public void show() {
        getProductsList().forEach(sp -> sp.show());
    }

    public List<Product> searchByPrice(double min, double max) {
        return this.getProductsList().stream().filter(sp -> sp.getUnitPrice() >= min && sp.getUnitPrice() <= max).collect(Collectors.toList());
    }


//get - set
    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public List<AddDiscount> getAddDiscountList() {
        return addDiscountList;
    }

    public void setAddDiscountList(List<AddDiscount> addDiscountList) {
        this.addDiscountList = addDiscountList;
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }
}
