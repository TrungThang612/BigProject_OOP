/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dangt
 */
public class DiscountB  extends Discount {
   private List<Services> listSV = new ArrayList<>();


    @Override
    public String toString() {
        return String.format(super.toString() + this.listSV.toString());
    }

    @Override
    public void input() throws ParseException {
        int n;
        super.input();
        System.out.println("Nhap so dich vu cua khuyen mai: ");
        n = Integer.parseInt(Tool.sc.next());
        for (int i=0; i<= n; i++){
            String namesv = Tool.sc.nextLine();
            this.listSV.add(new Services(namesv));
        }
    }

    public DiscountB(){}

    public DiscountB(String idDiscount, String fromDate, String toDate, Services...sv) throws Exception{
        listSV.addAll(Arrays.asList(sv));
    } 


  
}
