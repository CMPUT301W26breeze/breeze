package com.example.breeze;

public class Pentagon extends Shape {
    private int x;
    private int y;

    public Pentagon(){
        super();
    }
    public Pentagon(int x, int y, int x1) {
        super(x, y);
        this.x = x1;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
