package com.example.breeze;

public class Circle extends Shape{
    private int radius;
    public Circle(){
        this.radius=0; //default to zero
    }
    public Circle (int radius){
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
