/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

/**
 *
 * @author dangt
 */
public class DiscountC extends Discount{

    private static int dem;
    private double percentDiscount;
    private Category cate = new Category();
    private Product prod = new Product();

    {
        ++dem;
        this.idDiscount = String.format("C%04d",dem);
    }

    @Override
    public String toString() {
        return String.format(super.toString() +"- %d", percentDiscount);
    }

    public DiscountC(){}
    public DiscountC(String fromDate, String toDate, double percentDiscount, Category cate, Product prod) throws Exception {
        super(fromDate,toDate);
        this.setPercentDiscount(percentDiscount);
        this.setCate(cate);
        this.setProd(prod);
    }
    /**
     * @return the percentDiscount
     */
    public double getPercentDiscount() {
        return percentDiscount;
    }

    /**
     * @param percentDiscount the percentDiscount to set
     */
    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }


    public Category getCate() {
        return cate;
    }

    public void setCate(Category cate) {
        this.cate = cate;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
}
