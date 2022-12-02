/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author loctp
 */
public class Product {
    private static int dem = 0;
    private int idProd = ++dem;
    private String nameProd;
    private double unitPrice;
    private Category danhMuc;
    private List<Discount> discountList = new ArrayList<>();


    public Product(String nameProd, double unitPrice, Category danhMuc) {
        this.nameProd = nameProd;
        this.unitPrice = unitPrice;
        this.danhMuc = danhMuc;
    }

    public Product() {
    }


    /**
     * @return the idProd
     */
    public int getIdProd() {
        return idProd;
    }

    /**
     * @param idProd the idProd to set
     */
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    /**
     * @return the nameProd
     */
    public String getNameProd() {
        return nameProd;
    }

    /**
     * @param nameProd the nameProd to set
     */
    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the danhMuc
     */
    public Category getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(Category danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the discountList
     */
    public List<Discount> getDiscountList() {
        return discountList;
    }

    /**
     * @param discountList the discountList to set
     */
    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public void addDiscount(Discount discount) {
        this.discountList.add(discount);
    }

    public void show() {
        System.out.println("Ma san pham: " + this.getIdProd());
        System.out.println("Ten san pham: " + this.getNameProd());
        System.out.println("Gia san pham: " + this.getUnitPrice());


    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        nameProd = sc.nextLine();
        System.out.print("Nhap gia: ");
        unitPrice = sc.nextDouble();

    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + this.idProd + "\nTên sản phẩm " + this.nameProd + "\nGiá sản phẩm: " + this.unitPrice;
    }


}