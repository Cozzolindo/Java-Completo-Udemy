

import java.util.Date;

import Classes.Order;
import Classes.Status;

public class Main{
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), Status.Processing);

        System.out.println(order.toString());

        Status os1 = Status.Delivered;
        Status os2 = Status.valueOf("Delivered");

        System.out.println(os1);
        System.out.println(os2);
    }
}