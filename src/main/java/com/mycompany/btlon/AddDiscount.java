package com.mycompany.btlon;

public class AddDiscount {
    private Discount dc;
    private Product prod;

    public AddDiscount(Discount dc, Product prod) {
        this.dc = dc;
        this.prod = prod;
    }

    public void hienThi(){
        System.out.println(dc.getIdDiscount()+ " - " +prod.getNameProd());
    }
    public Discount getDc() {
        return dc;
    }

    public void setDc(Discount dc) {
        this.dc = dc;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
}
