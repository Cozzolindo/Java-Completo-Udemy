package Classes;

import Enums.Color;

public class Rectangle extends Shape{

    protected Double width;
    protected Double height;


    public Rectangle() {
    }


    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    @Override
    public double area() {
        
        return height*width;
    }

    
    
    
}
