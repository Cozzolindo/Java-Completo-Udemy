package Classes;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
