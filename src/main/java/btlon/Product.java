/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlon;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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


    public int countDisUpToDate(){
        int count=0;
        for (Discount x: this.discountList){
            if (!x.isOutDate()) count++;
        }
        return count;
    }
    public int compareProductByDis(Product a){
        if (this.countDisUpToDate()> a.countDisUpToDate())
            return 1;
        else if (this.countDisUpToDate()<a.countDisUpToDate())
            return -1;
        else
            return 0;
    }

    public void removeDiscountOutDate(){
        for (int i=0; i< this.discountList.size(); i++){
            if (this.discountList.get(i).isOutDate()){
                this.discountList.remove(i);
            }
        }
    }

    public void show() {
        System.out.println("Mã sản phẩm: " + this.getIdProd());
        System.out.println("Tên sản phẩm: " + this.getNameProd());
        System.out.println("Giá sản phẩm: " + Tool.currencyVN.format(this.getUnitPrice()) );
        System.out.println("Danh mục sản phẩm: " + this.getCategory());
        System.out.print("Mã khuyến mãi của sản phẩm: ");
        if (discountList.size() == 0) {
            System.out.println("Không có khuyến mãi trong sản phẩm!");
        } else {
            System.out.println();
            for (Discount i : getDiscountList()) {
                System.out.print(i.toString() + "\n");
            }
        }
    }
    public void showDc() {
        System.out.println("Tên sản phẩm: " + this.getNameProd());
        System.out.println("Mã khuyến mãi của sản phẩm: ");
        for (Discount i : getDiscountList()) {
            System.out.print(i.toString() + "\n");
        }
    }

    public void input() {
        System.out.print("Nhập tên sản phẩm: ");
        setNameProd(Tool.sc.nextLine());
        System.out.print("Nhập giá: ");
        setUnitPrice(Double.parseDouble(Tool.sc.nextLine()));
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