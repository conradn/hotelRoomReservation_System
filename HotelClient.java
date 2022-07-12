/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmi_hotel_mgt;

/**
 *
 * @author HP
 */
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HotelClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1090);
            RoomManager service = (RoomManager) reg.lookup("hotel");

            //  booking a room
            
            System.out.println(service.book_room("0", "Samuel"));
            System.out.println(service.book_room("0", "Linda"));
            System.out.println(service.book_room("2", "Xtian"));
            System.out.println(service.book_room("0", "Lorna"));
            System.out.println(service.book_room("1", "Conrad"));

            //  list of quests
            
            service.list_of_quests().forEach(name -> {
                System.out.println(name);
            });
            
            
             // print total revenue
             
             System.out.println(service.revenue());
             

            //  printing available rooms
            
            System.out.println(service.available_rooms("0"));
            System.out.println(service.available_rooms("1"));
            System.out.println(service.available_rooms("2"));
            System.out.println(service.available_rooms("3"));
            System.out.println(service.available_rooms("4"));

        } catch (NotBoundException | RemoteException e) {
            System.out.println(e);
        }

    }
}
