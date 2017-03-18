package com.example.asus.listview;

/**
 * Created by ASUS on 2017/3/7.
 */

public class Animal {
    private String name;
    private int imageID;
    public Animal(String name,int imageID){
        this.name = name;
        this.imageID = imageID;
    }

    public String getName(){
        return name;
    }

    public int getimageID(){
        return imageID;
    }
}
