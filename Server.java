
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author timothywanyaiye
 */


import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception {
        getBooking obj1 = new getBooking();
        getList obj2 = new getList();
        getGuests obj3 = new getGuest();
        getRevenue obj4 = new getRevenue();
//        what the client needs to see from the system
        Naming.rebind(Revenue, obj1);
        Naming.rebind(List, obj4);
        
        System.out.println("Server has started....");
    }
    
}
