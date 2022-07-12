/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author timothywanyaiye
 */


import java.rmi.*;

public class RoomManagerImp extends java.rmi.server.UnicastRemoteObject implements RoomManager {
    public RoomManagerImp() throws RemoteException {
        super();
    }

    @Override
    public String bookRoom(String roomType, String guestName) throws RemoteException {
        
        
        return ("The room " + roomType + " is occupied by " + guestName);
        
        
    }

    @Override
    public String list(String bookedRooms, String availableRooms) throws RemoteException {
        return ("These are the available rooms: " + availableRooms );
        
    }

    @Override
    public String getGuests(String roomBooked, String guestName) throws RemoteException {
        return ("Guest " + guestName + "booked room" + roomBooked);
    }

    @Override
    public String getRevenue(int amount, String roomType) throws RemoteException {
        return ("Room of type " + roomType + "costs " + amount);
    }
}
