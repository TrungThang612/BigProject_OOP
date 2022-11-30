/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

/**
 *
 * @author dangt
 */
public class DiscountA extends Discounts {
    private double percentDiscount ;
    public DiscountA(){   }
    public DiscountA(String idDiscount, String fromDate, String toDate, double percentDiscount) throws Exception{
        super(idDiscount, fromDate, toDate);
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
