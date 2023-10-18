package com.company.project.lesson9;

public class Gallery implements Drawable{
    private String name;
    private Image[] images;

    public Gallery(String name, Image[] images) {
        this.images = images;
        this.name = name;
    }

    public Image[] getImages() {
        return images;
    }

    @Override
    public void draw() {
        for (Image image : images) {
            image.draw();
        }
    }

    @Override
    public void clear() {
        for (Image image : images) {
            image.clear();
        }
    }
}
