package btlon;


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
public abstract class Discount {
    protected String idDiscount;
    private Date fromDate, toDate;

public long betweenDate(){
    Calendar today = new GregorianCalendar();
return Duration.between(today.getTime().toInstant(),this.toDate.toInstant()).toDays();
}

public boolean isOutDate(){
    Date today = new Date();
    today.getTime();
    Tool.f.format(today);
    if (this.getToDate().compareTo(today) < 0) {
        return true;
    } else {
        return false;
    }
}

    public void input () throws ParseException {
        String fromDate, toDate;
        do{
            System.out.println("Nhập ngày bắt dầu: ");
            fromDate = Tool.sc.nextLine();
            System.out.println("Nhập ngày hết hạn: ");
            toDate = Tool.sc.nextLine();
            if (Duration.between(Tool.f.parse(toDate).toInstant(),Tool.f.parse(fromDate).toInstant()).toDays()>0){
                System.out.println("Ngay het han truoc ngay tao hoac trung ngay tao");
            }else {
                this.toDate= Tool.f.parse(toDate);
                this.fromDate = Tool.f.parse(fromDate);
            }
        }while(Duration.between(Tool.f.parse(toDate).toInstant(),Tool.f.parse(fromDate).toInstant()).toDays()>0);
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
            throw new Exception ("Sai định dạng ngày tháng!!!");
        }
        try {
            this.toDate =Tool.f.parse(toDate);
        } catch (ParseException ex) {
            throw new Exception ("Sai định dạng ngày tháng!!!");
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
