package com.deepmodi.firebasemultirecyclerview.Model;

import java.util.ArrayList;

public class UploadItem {

    private String categoryName;
    private String categoryId;
    private ArrayList<CategoryTwo> data;

    public UploadItem() {
    }

    public UploadItem(String categoryName, String categoryId, ArrayList<CategoryTwo> data) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.data = data;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public ArrayList<CategoryTwo> getData() {
        return data;
    }

    public void setData(ArrayList<CategoryTwo> data) {
        this.data = data;
    }
}
