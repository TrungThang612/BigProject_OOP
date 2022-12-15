package btlon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ProductsManagement  {
    private List<Product> productsList = new ArrayList<>();

//     File f = new File("src/main/resources/Product.txt");
//     Scanner scanner = new Scanner(f);

    public ProductsManagement() throws FileNotFoundException {
        File f = new File("src/main/resources/Product.txt");
        try (Scanner scanner = new Scanner(f)){
            while(scanner.hasNext()) {
                String nameProd = scanner.nextLine();
                String unitPrice = scanner.nextLine();
                String category = scanner.nextLine();

               if (scanner.hasNext())
                   scanner.nextLine();
                System.out.printf("Tên sản phẩm: %s\nGiá sản phẩm: %.1f\nDanh mục: %s\n", nameProd,  unitPrice, category);
                System.out.println("===========");
            }
        }


    }


    public void sortByDiscount(){
        this.productsList.sort((p,q)-> p.compareProductByDis(q));
        Collections.reverse(this.productsList);
    }


    public void showProduct(){
        for (Product x: this.productsList){
            x.show();
        }
    }
    public Product searchProductbyID (int n){
        return this.productsList.stream().filter(Product -> Product.getIdProd()==n).findFirst().orElse(null);
    }
    public Product searchProductbyName (String n){
        return this.productsList.stream().filter(Product -> Product.getNameProd().equals(n)).findFirst().orElse(null);
    }
    public void addProd(Product... sp) {
        this.getProductsList().addAll(Arrays.asList(sp));
    }
    public Product searchByName(String nameProd) {
        return this.getProductsList().stream().filter(Products -> Products.getNameProd().equals(nameProd)).findFirst().orElse(null);
    }

    public List<Product> searchByPrice(double min, double max) {
        return this.getProductsList().stream().filter(sp -> sp.getUnitPrice() >= min && sp.getUnitPrice() <= max).collect(Collectors.toList());
    }
    public void removeDiscountsByOutDate(){
        for (int i=0; i< this.productsList.size(); i++){
            this.productsList.get(i).removeDiscountOutDate();
        }
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productList) {
        this.productsList = productList;
    }
}
