package Classes;

import java.util.Date;

public class Order {

    private Integer id;
    private Date moment;
    private Status status;


    public Order(){

    }

    public Order(Integer id, Date moment, Status status){
        this.status = status;
        this. moment = moment;
        this.id = id;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", moment='" + getMoment() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
    


}
