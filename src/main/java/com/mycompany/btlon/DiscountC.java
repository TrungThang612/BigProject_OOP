/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.text.ParseException;

/**
 *
 * @author dangt
 */
public class DiscountC extends Discount{

    private static int dem;
    private double percentDiscount;
    private Category cate = new Category();


    {
        ++dem;
        this.idDiscount = String.format("C%04d",dem);
    }

    @Override
    public void input() throws ParseException {
        double pc;
        super.input();
        System.out.printf("Nhap phan tram giam gia: ");
        pc = Double.parseDouble(Tool.sc.nextLine());
        this.setPercentDiscount(pc);
    }

    @Override
    public String toString() {
        return String.format(super.toString() +"- %d", getPercentDiscount());
    }

    public DiscountC(){}
    public DiscountC(String fromDate, String toDate, double percentDiscount, Category cate) throws Exception {
        super(fromDate,toDate);
        this.setPercentDiscount(percentDiscount);
        this.setCate(cate);
    }


    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public Category getCate() {
        return cate;
    }

    public void setCate(Category cate) {
        this.cate = cate;
    }
}
