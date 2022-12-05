/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author loctp
 */
public class Product {
    private static int dem = 0;
    private int idProd = ++dem;
    private String nameProd;
    private double unitPrice;
    private Category category;
    private List<Discount> discountList = new ArrayList<>();


    public Product(String nameProd, double unitPrice, Category category) {
        this.setNameProd(nameProd);
        this.setUnitPrice(unitPrice);
        this.setCategory(category);
    }

    public Product(String nameProd, double unitPrice) {
        this.setNameProd(nameProd);
        this.setUnitPrice(unitPrice);
    }

    public Product() {
    }


    public void removeDiscountOutDate(){
        for (int i = 0; i < this.discountList.size(); i++) {
            if (this.discountList.get(i).isOutDate()<0) this.discountList.remove(this.discountList.get(i));
        }
        System.out.println("Đã hoàn thành");
    }

    public void show() {
        System.out.println("Ma san pham: " + this.getIdProd());
        System.out.println("Ten san pham: " + this.getNameProd());
        System.out.println("Gia san pham: " + this.getUnitPrice());
        System.out.println("Danh muc san pham: " + this.getCategory());
        System.out.println("Ma khuyen mai cua san pham: ");
        for (Discount i: getDiscountList()
             ) {
            System.out.print(i.toString()+"\t");
        }
    }


    public void input() {
        System.out.print("Nhap ten san pham: ");
        setNameProd(Tool.sc.nextLine());
        System.out.print("Nhap gia: ");
        setUnitPrice(Double.parseDouble(Tool.sc.nextLine()));
        System.out.flush();
    }


    public void addDiscount (Discount... a){
        this.discountList.addAll(Arrays.asList(a));
    }
    @Override
    public String toString() {
        return "Mã sản phẩm: " + this.getIdProd() + "\nTên sản phẩm " + this.getNameProd() + "\nGiá sản phẩm: " + this.getUnitPrice() + "\nDanh muc: " + this.getCategory();
    }


    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }
}