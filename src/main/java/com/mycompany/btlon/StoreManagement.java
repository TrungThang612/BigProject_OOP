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



    //mehod product



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
