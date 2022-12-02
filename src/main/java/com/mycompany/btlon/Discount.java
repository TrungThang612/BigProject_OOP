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
    protected String idDiscount;
    private Date fromDate, toDate;

    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.idDiscount,this.fromDate, this.toDate);
    }

    public Discount() {
    }

    public Discount( String fromDate, String toDate) throws Exception {

        try {
            this.fromDate = Tool.f.parse(fromDate);
        } catch (ParseException ex) {
            throw new Exception ("Sai Dinh Dang Ngay Thang!!!");
        }
        try {
            this.toDate =Tool.f.parse(toDate);
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