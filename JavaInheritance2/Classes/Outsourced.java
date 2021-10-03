package Classes;

public class Outsourced extends Employee{
    
    protected Double addCharge;


    public Outsourced() {
    }


    public Outsourced(String name, Integer hours, Double valueHour, Double addCharge) {
        super(name, hours, valueHour);
        this.addCharge = addCharge;
    }


    public Double getAddCharge() {
        return this.addCharge;
    }

    public void setAddCharge(Double addCharge) {
        this.addCharge = addCharge;
    }

    @Override
    public double payment(){
        return super.payment() + addCharge*0.1;
    }


    @Override
    public String toString() {
        return "{" +
        " name='" + super.getName() + "'" +
        ", hours='" + super.getHours() + "'" +
        ", valueHour='" + super.getValueHour() + "'" +
            " addCharge='" + getAddCharge() + "'" +
            "}";
    }

}
