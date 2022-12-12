/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.btlon;

//import static jdk.vm.ci.aarch64.AArch64.sp;

import java.text.ParseException;
import java.util.Arrays;

/**
 * @author loctp
 */
public class BTL {

    public static void main(String[] args) throws ParseException {
        CategoryManagement cg = new CategoryManagement();
        StoreManagement sm = new StoreManagement();
        while (true) {
            System.out.println("\t \t\t \t\t \t_______________ & _____________");
            System.out.println("\t \t1. Thêm sản phẩm vào danh sách ");
            System.out.println("\t \t2. Tìm kiếm sản phẩm theo tên");
            System.out.println("\t \t3. Tìm kiếm sản phẩm theo khoảng giá");
            System.out.println("\t \t4. Tìm kiếm sản phẩm theo khuyến mãi");
            System.out.println("\t \t5. Them ma khuyen mai");
            System.out.println("\t \t6. Thêm khuyến mãi vào sản phẩm");
            System.out.println("\t \t7. Xóa các khuyến mãi hết hiệu lực khỏi sản phẩm");
            System.out.println("\t \t8. Các khuyến mãi sắp hết hiệu lực theo ngày x bạn nhập");
            System.out.println("\t \t9. Hiển thị thông tin sản phẩm chỉ định theo mã sản phẩm");
            System.out.println("\t \t10. Hiển thị danh sách sản phẩm theo khuyến mãi chỉ định");
            System.out.println("\t \t11. Danh sách sản phẩm giảm dần theo khuyến mãi còn hiệu lực");
            System.out.println("\t \t12. Hien danh sach san pham");
            System.out.println("\t \t13. Thoát chương trình!!");
            System.out.println("\t \t\t \t\t \t_______________ & _____________");
            System.out.print("\tNhập lựa chọn của bạn: ");
            String choice = Tool.sc.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.print("Nhập số sản phẩm: ");
                    int n = Integer.parseInt(Tool.sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                        Product a = new Product();
                        a.input();
                        System.out.print("Nhập tên danh mục: ");
                        String nameCate = Tool.sc.nextLine();
                        Category cate = cg.searchCategory(nameCate);
                        if (cate == null){
                             cate = new Category(nameCate);
                            cg.addCategory(cate);
                        }
                        a.setCategory(cate);
                        sm.addProd(a);
                    }
                }
                case "2" -> {
                    System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
                    String nameProd = Tool.sc.nextLine();

                    Product a = sm.searchByName(nameProd);

                    if (a == null) {
                        System.out.println("Không tìm thấy sản phẩm!");
                    } else {
                        System.out.println("Đã tìm thấy sản phẩm!");
                        a.show();
                    }
                }
                case "3" -> {
                    System.out.print("Nhập khoảng giá sản phẩm bạn muốn tìm: ");
                    System.out.println("\nNhập mức giá tối thiểu: ");
                    double min = Double.parseDouble(Tool.sc.nextLine());
                    System.out.println("Nhập mức giá tối đa: ");
                    double max = Double.parseDouble(Tool.sc.nextLine());
                    sm.searchByPrice(min, max).forEach(pmg -> pmg.show());
                    //Nhập khoảng giá
                    //Lọc sản phẩm trong khoảng giá tạo Ds in ra màn hình

                }
                case "4" -> {
                    System.out.println("Nhập mã khuyến mãi: ");
                    String km = Tool.sc.nextLine();
                    sm.searchsByNameDis(km).forEach(AddDiscount::show);
                    //Nhập khuyến mãi
                    // in ra các sp có km đó
                }
                case "5" -> {
                    int a,n;
                    System.out.printf("Nhap so luong khuyen mai: ");
                    n = Integer.parseInt(Tool.sc.next());
                    for (int i = 1; i <=n ; i++) {
                        System.out.printf("Nhap loai khuyen mai thu %d: ",i);
                        System.out.printf("1:A , 2:B , 3:C");
                        do{
                            a = Integer.parseInt(Tool.sc.next());
                            if (a<1 && a>3){
                                System.out.println("Khong co loai khuyen mai!!!!");
                            }
                        }while (a<1 && a>3);
                        Discount crDis;
                        switch (a){
                            case 1:
                                crDis = new DiscountA();
                                crDis.input();
                                sm.addDiscount(crDis);
                                break;
                            case 2:
                                crDis = new DiscountB();
                                crDis.input();
                                sm.addDiscount(crDis);
                                break;
                            case 3:
                                crDis = new DiscountC();
                                System.out.print("Nhập tên danh mục: ");
                                String nameCate = Tool.sc.nextLine();
                                Category cate = cg.searchCategory(nameCate);
                                if (cate == null){
                                    cate = new Category(nameCate);
                                    cg.addCategory(cate);
                                }
                                ((DiscountC) crDis).setCate(cate);
                                crDis.input();
                                sm.addDiscount(crDis);
                                break;
                    }

                    }
                }
                case "6" -> {
                        System.out.print("- Nhập tên sản phẩm cần thêm khuyến mãi: ");
                        String nameProd = Tool.sc.nextLine();
                        Product a = sm.searchByName(nameProd);

                        if (a == null) {
                            System.out.println("Không tìm thấy sản phẩm!!!");
                        } else {
                            sm.showDiscounts();
                            System.out.print("- Nhập mã khuyến mãi: ");
                            String nameDis = Tool.sc.nextLine();
                            Discount b = sm.searchByNameDis(nameDis);
                            if (b == null){
                                System.out.println("Không tìm thấy mã khuyến mãi!!!");
                            }
                            else {
                                sm.addDiscountToProduct(b, a);
                            }
                        }
                    // Tìm kiếm khuyến mãi (km)
                    // Kiểm tra có tìm được sản phẩm và khuyến mãi hay không
                    // Nếu có thêm khuyến mãi vào sản phẩm

                }
                case "7" -> {
                    sm.removeDiscountOutDate();
                }
                case "8" -> {
                    System.out.println("Nhap ngay ban can kiem tra: ");
                    long num = Long.parseLong(Tool.sc.nextLine());
                    sm.listDiscountByBetweenDate(num).forEach(x-> System.out.println(x));
                }
                case "9" -> {
                    System.out.println("Nhap ID san pham can tim kiem: ");
                    int idprod = Integer.parseInt(Tool.sc.nextLine());
                    if (sm.searchProductbyID(idprod)==null)
                        System.out.println("Khong tim thay san pham");
                    else
                        sm.searchProductbyID(idprod).show();
                }
                case "10" -> {
                    int a;
                    System.out.println ("Nhap loai khuyen mai thu can loc: ");
                    System.out.printf("1:A , 2:B , 3:C");
                    do{
                        a = Integer.parseInt(Tool.sc.next());
                        if (a<1 && a>3){
                            System.out.println("Khong co loai khuyen mai!!!!");
                        }
                    }while (a<1 && a>3);
                    Discount crDis;
                    switch (a){
                        case 1:
                            sm.filterDiscountA().forEach(g -> System.out.println(g));
                            break;
                        case 2:
                            sm.filterDiscountB().forEach(g -> System.out.println(g));
                            break;
                        case 3:
                            sm.filterDiscountC().forEach(g -> System.out.println(g));
                            break;
                    }
                }
                case "11" -> {
                    sm.sortDiscountByDate();
                    sm.getDiscountList();
                }
                case "12"->{
                    sm.showProduct();
                }
                case "13" -> {
                    System.out.println("Thoát chương trình !!");
                }
                default -> System.out.println("Chức năng chưa có");
            }
        }
    }
}
