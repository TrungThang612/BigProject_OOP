/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loctp
 */
public class ProductsManagement {
    private List<Product> productsList = new ArrayList<>();

    /**
     * @return the productsList
     */
    public List<Product> getProductsList() {
        return productsList;
    }

    /**
     * @param productsList the productsList to set
     */
    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }
   public void addProd(Product sp){
        this.getProductsList().add(sp);
    }
  public Product searchByName(String nameProd) {
        return this.productsList.stream().filter(Products -> Products.getNameProd().equals(nameProd)).findFirst().orElse(null);
    }
        public void show(){
    productsList.forEach(sp-> sp.show());
    }
}
