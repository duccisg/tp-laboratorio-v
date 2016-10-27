package com.utn.tp.model;

/**
 * Created by sebastian.g.ducci on 10/16/2016.
 */
public class Category {

    private String name;
    private String description;
    private boolean favorite;
    private byte[] photo;

    public Category() {

    }

    public Category(String name, String description, boolean favorite, byte[] photo) {
        this.name = name;
        this.description = description;
        this.favorite = favorite;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
