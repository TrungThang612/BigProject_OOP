/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dangt
 */
public class Category {
    private String nameCategory;
    private List<Product> prodList = new ArrayList<>();

    public  Category(){}
    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void addProduct(Product a){
        this.prodList.add(a);
    }
    @Override
    public String toString() {
        return String.format(this.nameCategory + "\n");
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getProdList() {
        return prodList;
    }

    public void setProdList(List<Product> prodList) {
        this.prodList = prodList;
    }
}
