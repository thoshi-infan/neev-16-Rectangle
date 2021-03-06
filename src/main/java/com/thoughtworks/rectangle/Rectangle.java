package com.thoughtworks.rectangle;

public class Rectangle {

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createShape(double length, double breadth){
        return new Rectangle(length, breadth);
    }

    public static Rectangle createShape(double side){
        return new Rectangle(side,side);
    }

    public double area(){
        if(this.length <= 0 || this.breadth <= 0) return 0;
        return this.length * this.breadth;
    }

    public double perimeter(){
        if(length <= 0 || breadth <= 0) return 0;
        return 2*(length + breadth);
    }
}
