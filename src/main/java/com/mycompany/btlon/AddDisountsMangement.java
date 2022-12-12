package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddDisountsMangement {
    private List<AddDiscount> addDiscountList = new ArrayList<>();

    public List<AddDiscount> searchsByNameDis(String km) {
        return this.addDiscountList.stream().filter(g1->g1.getDc().getIdDiscount().equals(km)).collect(Collectors.toList());
    }
    public void addDiscountToProduct(Discount a, Product b) {
        if (a instanceof  DiscountC){
            if (((DiscountC) a).getCate() == b.getCategory()){
                this.getAddDiscountList().add(new AddDiscount(a, b));
                b.addDiscount(a);
            }
            else{
                System.out.println("San pham khong cung danh muc voi khuyen mai!!!");
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


}
