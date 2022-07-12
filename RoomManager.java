
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
