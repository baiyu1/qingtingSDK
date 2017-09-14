package qingtingSDK.bean.category;

import qingtingSDK.bean.BaseResult;

import java.util.List;

public class CategoryData extends BaseResult{
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
