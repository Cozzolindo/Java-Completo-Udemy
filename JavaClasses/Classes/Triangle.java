package Classes;

public class Triangle {
    public double A;
    public double B;
    public double C;

    public Triangle(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getArea(){
        double p = (this.A + this.B + this.C)/2;
        return Math.sqrt(p*(p-this.A)*(p-this.B)*(p-this.C));
    }
}
