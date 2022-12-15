package btlon;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class Tool {
    public static final SimpleDateFormat  f = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner sc = new Scanner(System.in);
    public static final Locale localeVN = new Locale("vi", "VN");
    public static final NumberFormat vn = NumberFormat.getInstance(localeVN);
    public static final NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);

}
