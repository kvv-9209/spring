package ru.gb.homework2;

public class Product {

    private int id;
    private String title;
    private float coast;

    public Product(int id, String title, float coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCoast() {
        return coast;
    }

}
