/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author loctp
 */
public class StoreManagement {
    private List<Product> productsList = new ArrayList<>();
    private List<AddDiscount> addDiscountList = new ArrayList<>();
    private List<Discount> discountList = new ArrayList<>();


    public void showProduct(){
        for (Product x: this.productsList){
            x.show();
        }
    }
    public void addDiscountToProduct(Discount a, Product b) {
        if (a instanceof  DiscountC){
            if (((DiscountC) a).getCate() == b.getCategory()){
                this.getAddDiscountList().add(new AddDiscount(a, b));
                b.addDiscount(a);
            }
            else{
                System.out.println("San pham khong cung danh muc voi khuyen mai!!!");
            }
        }else {
            this.getAddDiscountList().add(new AddDiscount(a, b));
            b.addDiscount(a);
        }

    }

    public void removeDiscountOutDate (){
        for (Product x: this.productsList){
             x.removeDiscountOutDate();
        }
        for (AddDiscount x : this.addDiscountList){
            if (x.getDc().isOutDate()) this.addDiscountList.remove(x);
        }
    }

    //method discount
    public List<Discount> filterDiscountA(){
        List<Discount> kq = new ArrayList<>();
        for (Discount dc: this.discountList){
            if (dc instanceof DiscountA){
                kq.add(dc);
            }
        }
        return kq;
    }

    public List<Discount> filterDiscountB(){
        List<Discount> kq = new ArrayList<>();
        for (Discount dc: this.discountList){
            if (dc instanceof DiscountB){
                kq.add(dc);
            }
        }
        return kq;
    }

    public List<Discount> filterDiscountC(){
        List<Discount> kq = new ArrayList<>();
        for (Discount dc: this.discountList){
            if (dc instanceof DiscountC){
                kq.add(dc);
            }
        }
        return kq;
    }

    public void showDiscountsList (){
        this.discountList.forEach(g1->System.out.println(g1));
    }

    public void sortDiscountByDate(){
        Collections.sort(this.discountList);
    }

    public List<Discount> listDiscountByBetweenDate (long num){
        return this.discountList.stream().filter(Discount->Discount.betweenDate()==num).collect(Collectors.toList());
    }

    public void addDiscount (Discount a){
        this.discountList.add(a);
    }

    public List<AddDiscount> searchsByNameDis (String nameDis){
        return this.addDiscountList.stream().filter(AddDiscount ->AddDiscount.getDc().getIdDiscount().equals(nameDis)).collect(Collectors.toList());
    }
    public Discount searchByNameDis(String nameDis) {
        return this.discountList.stream().filter(AddDiscount -> AddDiscount.getIdDiscount().equals(nameDis)).findFirst().orElse(null);
    }

    //mehod product
    public Product searchProductbyID (int n){
        return this.productsList.stream().filter(Product -> Product.getIdProd()==n).findFirst().orElse(null);
    }
    public void addProd(Product sp) {
        this.getProductsList().add(sp);
    }
    public Product searchByName(String nameProd) {
        return this.getProductsList().stream().filter(Products -> Products.getNameProd().equals(nameProd)).findFirst().orElse(null);
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

    public void showDiscounts(){
        this.discountList.forEach( g -> System.out.println(g));
    }
}
