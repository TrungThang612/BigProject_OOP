/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dangt
 */
public class DiscountB  extends Discount {
   private List<Services> listSV = new ArrayList<>();
   private Category cate = new Category();

    @Override
    public String toString() {
        return String.format(super.toString() + this.listSV.toString());
    }

    public DiscountB(String idDiscount, String fromDate, String toDate, Services...sv) throws Exception{
        listSV.addAll(Arrays.asList(sv));
    } 
    
  
}
