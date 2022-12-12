package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsManagement {
    private List<Product> productsList = new ArrayList<>();


    public void sortByDiscount(){
        this.productsList.sort((p,q)-> p.compareProductByDis(q));
        Collections.reverse(this.productsList);
    }


    public void showProduct(){
        for (Product x: this.productsList){
            x.show();
        }
    }
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

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productList) {
        this.productsList = productList;
    }
}
