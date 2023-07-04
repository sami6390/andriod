package com.ss.myapplication;

public class Brick {

    private boolean isVisible ;
    public int row , column ,width , height;

    public Brick(int row ,int column ,int width ,int height){
        isVisible =true;
        this.row = row;
        this.column = column;
        this.width = width;
        this.height = height;
    }

    public boolean getisVisible() {
        return isVisible;
    }

    public void setVisible() {
        isVisible = false;
    }
}
