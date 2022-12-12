package com.mycompany.btlon;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.NumberFormat;
public class Tool {
    public static final SimpleDateFormat  f = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner sc = new Scanner(System.in);
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    String str1 = currencyVN.format(vnd);
	System.out.println("Số " + vnd + " sau khi định dạng = " + str1);
}
