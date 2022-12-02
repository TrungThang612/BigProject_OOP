package com.mycompany.btlon;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dangt
 */
public class Discount {
    private String idDiscount;
    private Date fromDate, toDate;

    public Discount() {
    }

    public Discount(String idDiscount, String fromDate, String toDate) throws Exception {
        this.idDiscount = idDiscount;
        try {
            this.fromDate = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
        } catch (ParseException ex) {
            throw new Exception ("Sai Dinh Dang Ngay Thang!!!");
        }
        try {
            this.toDate = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
        } catch (ParseException ex) {
            throw new Exception ("Sai Dinh Dang Ngay Thang!!!");
        }
    }

    
    /**
     * @return the idDiscount
     */
    public String getIdDiscount() {
        return idDiscount;
    }

    /**
     * @param idDiscount the idDiscount to set
     */
    public void setIdDiscount(String idDiscount) {
        this.idDiscount = idDiscount;
    }

    /**
     * @return the fromDate
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    
   
    
    
     
}
