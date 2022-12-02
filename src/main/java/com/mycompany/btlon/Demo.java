package com.mycompany.btlon;

public class Demo {
    public static void main (String []args) throws Exception {
        Discount a = new DiscountA("11/11/2022","12/12/2022",0.5);
        Discount b = new DiscountA("11/11/2022","12/12/2022",0.5);
        Discount c = new DiscountA("11/11/2022","12/12/2022",0.5);
        Discount d = new DiscountA("11/11/2022","12/12/2022",0.5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
