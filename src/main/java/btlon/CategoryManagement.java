package btlon;

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


    public void addCategory(Category c){
        this.cateList.add(c);
    }

}
