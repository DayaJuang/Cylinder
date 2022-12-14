package org.example;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = Math.max(0,radius);
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
