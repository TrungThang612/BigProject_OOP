/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author loctp
 */
public class BTL {

    public static void main(String[] args) {
        ProductsManagement pm = new ProductsManagement();
        CategoryManagement cm = new CategoryManagement();
        int n, choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("_______________ & _____________");
        System.out.println("1. Them san pham vao danh sach: ");
        System.out.println("2. Tim kiem san pham theo ten");
        System.out.println("3. Tim kiem san pham theo khoang gia chi dinh");
        System.out.println("4. Tim kiem san pham theo tung loai khuyen mai");
        System.out.println("5. Them khuyen mai vao mot san pham");
        System.out.println("6. Xoa cac khuyen mai het hieu luc khoi san pham ");
        System.out.println("7. Cac khuyen mai sap het hieu luc theo ngay x ban nhap");
        System.out.println("8. Hien thi thong tin san pham chi dinh theo ten san pham");
        System.out.println("9. Hien thi thong tin san pham chi dinh theo ma san pham");
        System.out.println("10. Hien thi danh sach san pham theo khuyen mai chi dinh");
        System.out.println("11. Danh sach san pham giam dan theo khuyen mai con hieu luc");
        System.out.println("12. Thoat chuong trinh!!");
        System.out.println("_______________ & _____________");

        do {
            System.out.println("Nhap lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {

                    System.out.print("Nhap so san pham: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");

                        Product sp = new Product();
                        sp.input();
                        pm.addProd(sp);
                    }
                }

                case 2 -> {

                    System.out.print("Nhap ten san pham ban muon tim: ");
                    String nameProd = sc.nextLine();

                    Product a = pm.searchByName(nameProd);

                    if (a == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(a.toString());
                    }
                    pm.show();
                }

                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {

                }
                case 9 -> {

                }
                case 10 -> {

                }
                case 11 -> {

                }
                case 12 -> {

                }

            }
        } while (choice != 12);
//
//            ProductsManagement pm = new ProductsManagement();
//            System.out.print("Nhap so san pham: ");
//            n = Integer.parseInt(sc.nextLine());
//            for (int i = 0; i < n; i++) {
//                System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");
//                Product sp = new Product();
//                sp.input();
//                pm.addProd(sp);
//
//            }
//            System.out.print("Nhap ten san pham ban muon tim: ");
//            String nameProd = sc.nextLine();
//
//            Product a = pm.searchByName(nameProd);
//
//            if (a == null) {
//                System.out.println("Not found");
//            } else {
//                System.out.println(a.toString());
//            }
//            pm.show();

    }
}
