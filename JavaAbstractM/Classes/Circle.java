package Classes;

import Enums.Color;

public class Circle extends Shape{

    protected Double radius;


    public Circle() {
    }


    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }


    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    
    @Override
    public double area() {
        
        return Math.PI*radius*radius;
    }
    
}
