package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    protected Integer roomNum;
    protected Date checkIn;
    protected Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation() {
    }


    public Reservation(Integer roomNum, Date checkIn, Date checkOut) throws DomainException {
        if(!(checkOut.after(checkIn))){
            throw new DomainException("Check-out date must be after check-in!");
        }
        this.roomNum = roomNum;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    public Integer getRoomNum() {
        return this.roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Date getCheckIn() {
        return this.checkIn;
    }

    

    public Date getCheckOut() {
        return this.checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDate(Date checkIn, Date checkOut) throws DomainException{
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        Date now = new Date();
        if(checkIn.before(now)||checkOut.before(now)){
            throw new DomainException("Illegal reservation dates");
        } else if(!(checkOut.after(checkIn))){
            throw new DomainException("Check-out date must be after check-in!");
        }
    }


    @Override
    public String toString() {
        return "{" +
            " Room='" + getRoomNum() + "'" +
            ", checkIn='" + sdf.format(getCheckIn()) + "'" +
            ", checkOut='" + sdf.format(getCheckOut()) + "'" +
            ", '" + duration() + "'' nights. " + 
            "}";
    }

    
    

    
}
