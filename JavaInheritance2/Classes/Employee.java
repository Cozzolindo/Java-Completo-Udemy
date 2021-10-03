package Classes;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valueHour;


    public Employee() {
    }


    public Employee(String name, Integer hours, Double valueHour) {
        this.name = name;
        this.hours = hours;
        this.valueHour = valueHour;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return this.hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValueHour() {
        return this.valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public double payment(){
        return hours * valueHour;
    }


    
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", hours='" + getHours() + "'" +
            ", valueHour='" + getValueHour() + "'" +
            "}";
    }

}
