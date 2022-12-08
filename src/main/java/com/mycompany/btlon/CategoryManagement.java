package com.mycompany.btlon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class CategoryManagement {
    private List<Category> cateList = new ArrayList<>();


    public List<Category> getCateList() {
        return cateList;
    }

    public void setCateList(List<Category> cateList) {
        this.cateList = cateList;
    }

    public CategoryManagement(Category... cateList) {
        this.cateList.addAll(Arrays.asList(cateList));
    }

    public CategoryManagement() {
    }


    public Category searchCategory(String nameCate) {
        return this.cateList.stream().filter(g1 -> g1.getNameCategory().equalsIgnoreCase(nameCate)).findFirst().orElse(null);
    }

    public void addCategory(String nameCate) {
        if (searchCategory(nameCate) == null)
            this.cateList.add(new Category(nameCate));
        else throw new InputMismatchException("Da co danh muc");
    }

    public void addCategory(Category c){
        this.cateList.add(c);
    }
    public void showCateList (){
        if (this.cateList.stream().count() == 0){
            System.out.println("Danh sach trong");
        }else{
            for (int i =0; i< this.cateList.size(); i++){
                System.out.println(i + this.cateList.get(i).getNameCategory());
            }
        }
    }
}
