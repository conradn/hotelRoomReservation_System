
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RoomManager extends Remote {

   //returns the available rooms of a given type

    public String available_rooms(String room_type) throws RemoteException;

    //books a room of a given type for a guest

    public String book_room(String room_type,String guest) throws RemoteException;
    

   //returns list of guests
    public ArrayList<String> list_of_guests() throws RemoteException;


    //returns the total revenue of the hotel

    public String revenue() throws RemoteException;
}