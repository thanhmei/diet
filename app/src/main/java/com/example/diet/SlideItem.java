package com.example.diet;

public class SlideItem {
    private int imageResId;
    private String title;
    private String subtitle;

    public SlideItem(int imageResId, String title, String subtitle) {
        this.imageResId = imageResId;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}

