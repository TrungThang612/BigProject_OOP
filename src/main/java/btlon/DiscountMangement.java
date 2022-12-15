package btlon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DiscountMangement {
    private List<Discount> discountList = new ArrayList<>();

    public Discount searchByNameDis(String nameDis) {
        return this.discountList.stream().filter(Discount->Discount.getIdDiscount().equals(nameDis)).findFirst().orElse(null);
    }

    public List<Discount> listDiscountByBetweenDate (long num){
        return this.discountList.stream().filter(Discount->Discount.betweenDate()==num).collect(Collectors.toList());
    }

    public void addDiscount (Discount a){
        this.discountList.add(a);
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }


    public void showDiscounts() {
        this.discountList.forEach(g->System.out.println(g));
    }



}
