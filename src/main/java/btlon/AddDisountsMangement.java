package btlon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddDisountsMangement {
    private List<AddDiscount> addDiscountList = new ArrayList<>();

    public List<AddDiscount> searchsByNameDis(String km) {
        return this.addDiscountList.stream().filter(g1->g1.getDc().getIdDiscount().equals(km)).collect(Collectors.toList());
    }

    public void show (){
       this.addDiscountList.forEach (a-> a.show() );
    }

    public List<AddDiscount> searchByType(String type) throws ClassNotFoundException {
        Class c = Class.forName(type);
        return this.addDiscountList.stream().filter(addDiscount -> c.isInstance(addDiscount.getDc())).collect(Collectors.toList());
    }
    public void addDiscountToProduct(Discount a, Product b) {
        if (a instanceof  DiscountC){
            if (((DiscountC) a).getCate() == b.getCategory()){
                this.getAddDiscountList().add(new AddDiscount(a, b));
                b.addDiscount(a);
            }
            else{
                System.out.println("Sản phẩm không cùng danh mục với khuyến mãi!!!");
            }
        }else {
            this.getAddDiscountList().add(new AddDiscount(a, b));
            b.addDiscount(a);
        }

    }

    public List<AddDiscount> getAddDiscountList() {
        return addDiscountList;
    }

    public void setAddDiscountList(List<AddDiscount> addDiscountList) {
        this.addDiscountList = addDiscountList;
    }


    public void removeDiscountsOutDate (){
        for (AddDiscount a: this.addDiscountList){
            if (!(a.getDc().isOutDate()== true)){
                this.addDiscountList.remove(a);
            }
        }
    }
}
