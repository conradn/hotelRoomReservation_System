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
        //msg that shows up if no options are listed
        String help_msg = "This is how you can use this command \n";
        help_msg += "\t HotelClient list <server address> to list the available number of rooms in each price range \n";
        help_msg += "\t HotelClient book <server address> <room type> <quest name> to book a room \n";
        help_msg += "\t HotelClient quests <server address> to list the names of all the registered guests\n";
        help_msg += "\t HotelClient revenue <server address> for revenue breakdown \n";

        try {

            if (args.length == 0) {

                System.out.print(help_msg);

            } //   list the available number of rooms in each price range 
            else if (args[0].equals("list") & args[1].equals("localhost") & args.length == 2) {

                Registry reg = LocateRegistry.getRegistry(args[1], 1090);
                RoomManager service = (RoomManager) reg.lookup("hotel");

                System.out.println(service.available_rooms("0"));
                System.out.println(service.available_rooms("1"));
                System.out.println(service.available_rooms("2"));
                System.out.println(service.available_rooms("3"));
                System.out.println(service.available_rooms("4"));

            } //  booking a room
            else if (args[0].equals("book") & args[1].equals("localhost") & args.length == 4) {

                Registry reg = LocateRegistry.getRegistry(args[1], 1090);
                RoomManager service = (RoomManager) reg.lookup("hotel");

                System.out.println(service.book_room(args[2], args[3]));

            } // list the names of all the registered guests
            else if (args[0].equals("quests") & args[1].equals("localhost") & args.length == 2) {

                Registry reg = LocateRegistry.getRegistry(args[1], 1090);
                RoomManager service = (RoomManager) reg.lookup("hotel");

                service.list_of_quests().forEach(name -> {
                    System.out.println(name);
                });

            } // revenue breakdown
            else if (args[0].equals("revenue") & args[1].equals("localhost") & args.length == 2) {
                
                Registry reg = LocateRegistry.getRegistry(args[1], 1090);
                RoomManager service = (RoomManager) reg.lookup("hotel");

                System.out.println(service.revenue());
            } //if command is not supported
            else {
                System.out.println("Command is not supported");
                System.out.print(help_msg);
            }

        } catch (NotBoundException | RemoteException e) {
            System.out.println(e);
        }

    }

}
