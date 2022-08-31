package com.example.recyclerview;

public class Book {

    private String title;
    private String Category;
    private String Description;
    private int Thumbnail;

    public Book() {

    }

    public Book(String title, String category, String description, int thumbnail) {
        this.title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
