<<<<<<< Updated upstream

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author timothywanyaiye
 */
public interface RoomManager extends Remote {
    public String booking (String room, String guest) throws RemoteException;
    public String list (String AllRooms, String BookedRooms) throws RemoteException;
    public String guest (String RoomBooked, String guest) throws RemoteException;
    public void revenue() throws RemoteException;



    
}
=======
import java.rmi.*;
public interface RoomManager extends Remote{

    public void addGuest(String roomName, String guestName) throws RemoteException;//add guest to room
   // public void removeGuest(String roomName, String guestName) throws RemoteException;//remove guest from room
    //public void printRooms() throws RemoteException; // print all rooms and guests in each room
    public void printGuests() throws RemoteException; // print all guests and rooms they are in
    public void printrevenue() throws RemoteException; // print total revenue of all rooms
    public void printavailable() throws RemoteException; // print all rooms that are available
    
}
>>>>>>> Stashed changes
