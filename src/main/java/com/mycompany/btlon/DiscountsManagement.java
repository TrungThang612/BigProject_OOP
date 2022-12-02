package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.List;

public class DiscountsManagement {

    private List<AddDiscount> dcList = new ArrayList<>();


    public List<AddDiscount> getDcList() {
        return dcList;
    }

    public void setDcList(List<AddDiscount> dcList) {
        this.dcList = dcList;
    }
}
