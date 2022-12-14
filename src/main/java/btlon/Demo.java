package btlon;

public class Demo {
    public static void main (String []args) throws Exception {
        Discount a = new DiscountA("11/11/2022","1/12/2022",0.5);
        Discount b = new DiscountA("11/11/2022","14/12/2022",0.5);
        Discount c = new DiscountA("11/11/2022","13/12/2022",0.5);
        Discount d = new DiscountA("11/11/2022","15/12/2022",0.5);

        System.out.println(b.betweenDate());
    if (b.isOutDate())
        System.out.println("Hết hạn");
    else
        System.out.println("Còn hạn");
        }
}
