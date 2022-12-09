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
public class DiscountA extends Discount {
    private double percentDiscount ;
    private static int dem;

    {
        ++dem;
        idDiscount = String.format("A%02d", dem);
    }

    @Override
    public void input() throws ParseException {
        double pc;
        super.input();
        System.out.println("Nhap phan tram giam gia: ");
        pc = Double.parseDouble(Tool.sc.nextLine());
        this.percentDiscount = pc;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "- %.1f", percentDiscount);
    }

    public DiscountA(){   }
    public DiscountA(String fromDate, String toDate, double percentDiscount) throws Exception{
        super(fromDate, toDate);
        this.percentDiscount = percentDiscount;
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
}
