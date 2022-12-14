/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package btlon;

//import static jdk.vm.ci.aarch64.AArch64.sp;

import java.text.ParseException;
import java.util.Arrays;

/**
 * @author loctp
 */
public class BTL {

    public static void main(String[] args) throws ParseException, ClassNotFoundException {
        CategoryManagement cg = new CategoryManagement();
        DiscountMangement dm = new DiscountMangement();
        ProductsManagement pm = new ProductsManagement();
        AddDisountsMangement am = new AddDisountsMangement();
        while (true) {
            System.out.println("\t \t\t \t\t \t_______________ & _____________");
            System.out.println("\t \t1. Thêm sản phẩm vào danh sách ");
            System.out.println("\t \t2. Thêm mã khuyến mãi");
            System.out.println("\t \t3. Thêm khuyến mãi vào sản phẩm");
            System.out.println("\t \t4. Tìm kiếm sản phẩm theo tên");
            System.out.println("\t \t5. Tìm kiếm sản phẩm theo khoảng giá");
            System.out.println("\t \t6. Tìm kiếm sản phẩm theo khuyến mãi");
            System.out.println("\t \t7. Xóa các khuyến mãi hết hiệu lực khỏi sản phẩm");
            System.out.println("\t \t8. Các khuyến mãi sắp hết hiệu lực theo ngày x bạn nhập");
            System.out.println("\t \t9. Hiển thị thông tin khuyến mãi của sản phẩm chỉ định theo mã sản phẩm");
            System.out.println("\t \t10. Hiển thị thông tin khuyến mãi của sản phẩm chỉ định theo tên sản phẩm");
            System.out.println("\t \t11. Hiển thị danh sách sản phẩm theo khuyến mãi chỉ định");
            System.out.println("\t \t12. Danh sách sản phẩm giảm dần theo số lượng khuyến mãi còn hiệu lực");
            System.out.println("\t \t13. Hiển thị danh sách sản phẩm");
            System.out.println("\t \t14. Thoát chương trình!!");
            System.out.println("\t \t\t \t\t \t_______________ & _____________");
            System.out.print("Nhập lựa chọn của bạn: ");
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
                        pm.addProd(a);
                    }
                }
                case "2" -> {
                    int a,n;
                    System.out.printf("Nhập số lượng khuyến mãi: ");
                    n = Integer.parseInt(Tool.sc.nextLine());
                    for (int i = 1; i <=n ; i++) {
                        System.out.printf("Nhập khuyến mãi thứ %d: ",i);
                        System.out.printf("1:A , 2:B , 3:C: ");
                        do{
                            a = Integer.parseInt(Tool.sc.nextLine());
                            if (a<1 && a>3){
                                System.out.println("Không có loại khuyến mãi này!!!!");
                            }
                        }while (a<1 && a>3);
                        Discount crDis;
                        switch (a){
                            case 1:
                                crDis = new DiscountA();
                                crDis.input();
                                dm.addDiscount(crDis);
                                break;
                            case 2:
                                crDis = new DiscountB();
                                crDis.input();
                                dm.addDiscount(crDis);
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
                                dm.addDiscount(crDis);
                                break;
                        }

                    }
                }
                case "3" -> {
                    System.out.print("- Nhập tên sản phẩm cần thêm khuyến mãi: ");
                    String nameProd = Tool.sc.nextLine();
                    Product a = pm.searchByName(nameProd);

                    if (a == null) {
                        System.out.println("Không tìm thấy sản phẩm!!!");
                    } else {
                        dm.showDiscounts();
                        System.out.print("- Nhập mã khuyến mãi: ");
                        String nameDis = Tool.sc.nextLine();
                        Discount b = dm.searchByNameDis(nameDis);
                        if (b == null){
                            System.out.println("Không tìm thấy mã khuyến mãi!!!");
                        }
                        else {
                            am.addDiscountToProduct(b, a);
                        }
                    }
                    // Tìm kiếm khuyến mãi (km)
                    // Kiểm tra có tìm được sản phẩm và khuyến mãi hay không
                    // Nếu có thêm khuyến mãi vào sản phẩm

                }
                case "4" -> {
                    System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
                    String nameProd = Tool.sc.nextLine();
                    Product a = pm.searchByName(nameProd);

                    if (a == null) {
                        System.out.println("Không tìm thấy sản phẩm!");
                    } else {
                        System.out.println("Đã tìm thấy sản phẩm!");
                        a.show();
                    }
                }
                case "5" -> {
                    System.out.print("Nhập khoảng giá sản phẩm bạn muốn tìm: ");
                    System.out.println("\nNhập mức giá tối thiểu: ");
                    double min = Double.parseDouble(Tool.sc.nextLine());
                    System.out.println("Nhập mức giá tối đa: ");
                    double max = Double.parseDouble(Tool.sc.nextLine());
                    pm.searchByPrice(min, max).forEach(pmg -> pmg.show());
                    //Nhập khoảng giá
                    //Lọc sản phẩm trong khoảng giá tạo Ds in ra màn hình

                }
                case "6" -> {
                    System.out.println("Nhập mã khuyến mãi: ");
                    String km = Tool.sc.nextLine();
                    am.searchsByNameDis(km).forEach(AddDiscount::show);
                    //Nhập khuyến mãi
                    // in ra các sp có km đó
                }
                case "7" -> {
                    pm.removeDiscountsByOutDate();
                    System.out.println("Đã xóa khuyến mãi hết hạn của các sản phẩm!");
                }
                case "8" -> {
                    System.out.print("Nhập ngày bạn cần kiểm tra: ");
                    long num = Long.parseLong(Tool.sc.nextLine());
                    dm.listDiscountByBetweenDate(num).forEach(x-> System.out.println(x));
                }
                case "9" -> {
                    System.out.println("Nhập ID sản phẩm cần tìm kiếm: ");
                    int idprod = Integer.parseInt(Tool.sc.nextLine());
                    if (pm.searchProductbyID(idprod)==null)
                        System.out.println("Không tìm thấy sản phẩm");
                    else {
                        if (pm.searchProductbyID(idprod).getDiscountList().size()>0)
                            pm.searchProductbyID(idprod).showDc();
                        else
                            System.out.println("Sản phẩm không có khuyến mãi");
                    }
//                        pm.searchProductbyID(idprod).showDc();
                }
                case "10" -> {
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
                    String nameprod = Tool.sc.nextLine();

                    if (pm.searchProductbyName(nameprod)==null)
                        System.out.println("Không tìm thấy sản phẩm");
                    else {
                        if (pm.searchProductbyName(nameprod).getDiscountList().size()>0)
                            pm.searchProductbyName(nameprod).showDc();
                        else
                            System.out.println("Sản phẩm không có khuyến mãi");
                    }
                }
                case "11" -> {
                    int a;
                    System.out.println ("Nhập loại khuyến mãi: ");
                    System.out.printf("1:A , 2:B , 3:C: ");
                    do{
                        a = Integer.parseInt(Tool.sc.nextLine());
                        if (a<1 && a>3){
                            System.out.println("Không có loại khuyến mãi này!!!!");
                        }
                    }while (a<1 && a>3);
                    switch (a){
                        case 1:
                            am.searchByType("btlon.DiscountA").forEach(g->g.show());
                            break;
                        case 2:
                            am.searchByType("btlon.DiscountB").forEach(g->g.show());
                            break;
                        case 3:
                            am.searchByType("btlon.DiscountC").forEach(g->g.show());
                            break;
                    }
                }
                case "12" -> {
                    pm.sortByDiscount();
                    pm.showProduct();
                }
                case "13"->{
                    pm.showProduct();
                }
                case "14" -> {
                    System.out.println("Thoát chương trình !!");
                }
                default -> System.out.println("Chức năng chưa có!");
            }
        }
    }
}
