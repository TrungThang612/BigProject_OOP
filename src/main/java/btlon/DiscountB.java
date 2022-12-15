/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlon;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dangt
 */
public class DiscountB  extends Discount {
    private List<Service> listSV = new ArrayList<>();
    {
        idDiscount = String.format("B%04d", (int)(Math.random()*(99999-10000+1)+1000));
    }

    @Override
    public String toString() {
        return String.format(super.toString() + this.listSV.toString());
    }

    @Override
    public void input() throws ParseException {
        int n;
        super.input();
        System.out.println("Nhập số dịch vụ của khuyến mãi: ");
        n = Integer.parseInt(Tool.sc.next());
        System.out.println("Nhập tên dịch vụ");
        for (int i=0; i<= n; i++){
            String namesv = Tool.sc.nextLine();
            this.listSV.add(new Service(namesv));
        }
    }

    public DiscountB(){}

    public DiscountB(String idDiscount, String fromDate, String toDate, Service...sv) throws Exception{
        listSV.addAll(Arrays.asList(sv));
    } 


  
}
