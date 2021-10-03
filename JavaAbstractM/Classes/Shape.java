package Classes;

import Enums.Color;

public abstract class Shape {
   
    protected Color color;


    public Shape() {
    }


    public Shape(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
    
}
