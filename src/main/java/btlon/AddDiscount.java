package btlon;

public class AddDiscount implements Comparable<AddDiscount>{
    private Discount dc;
    private Product prod;

    public AddDiscount(Discount dc, Product prod) {
        this.dc = dc;
        this.prod = prod;
    }

    public void show(){
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

    @Override
    public int compareTo(AddDiscount o) {
        if (this.getDc().betweenDate()> o.getDc().betweenDate())
            return 1;
        else if (this.getDc().betweenDate()> o.getDc().betweenDate())
            return -1;
        else return 0;
    }
}
