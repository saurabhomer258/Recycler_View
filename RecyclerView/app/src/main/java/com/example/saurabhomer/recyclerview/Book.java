package com.example.saurabhomer.recyclerview;

/**
 * Created by saurabh omer on 23-Mar-18.
 */

public class Book {
    private String Title;
    private String Category;
    private String Description;
    private  int Thumbnal;

    public Book() {
    }

    public Book(String title, String category, String description, int thumbnal) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnal = thumbnal;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnal() {
        return Thumbnal;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnal(int thumbnal) {
        Thumbnal = thumbnal;
    }
}
