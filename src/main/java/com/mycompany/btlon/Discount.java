package com.mycompany.btlon;


import java.text.ParseException;

import java.time.Duration;


import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dangt
 */
public abstract class Discount implements Comparable<Discount>{
    protected String idDiscount;
    private Date fromDate, toDate;

public long betweenDate(){
    Calendar today = new GregorianCalendar();
return Duration.between( today.getTime().toInstant(),this.toDate.toInstant()).toDays();

}

public boolean isOutDate(){
    if(this.betweenDate()>0){
        return false;
    }
    return true;
}

    public void input () throws ParseException {
        String fromDate, toDate;
        System.out.println("Nhap ngay bat dau: ");
        fromDate = Tool.sc.nextLine();
        System.out.println("Nhap ngay het han: ");
        toDate = Tool.sc.nextLine();
        this.toDate= Tool.f.parse(fromDate);
        this.fromDate = Tool.f.parse(toDate);
    }


    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.idDiscount,Tool.f.format(this.fromDate), Tool.f.format(this.toDate));
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

    @Override
    public int compareTo(Discount o) {
        if (this.betweenDate()> o.betweenDate())
            return 1;
        else if (this.betweenDate()< o.betweenDate())
            return -1;
        else return 0;
    }
}
