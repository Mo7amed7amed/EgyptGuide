package com.example.mohamed.egyptguide;

/**
 * Created by Mohamed on 13/12/2017.
 */

public class Places {
    private int image;
    private String title;
    private String description ;
public Places (String title){
    this.title =title;
}
    public Places(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getImage() { return image; }
}
