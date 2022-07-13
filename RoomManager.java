
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RoomManager extends Remote {

   
    public String available_rooms(String room_type) throws RemoteException;//returns the available rooms of a given type

    
    public String book_room(String room_type,String guest) throws RemoteException;//books a room of a given type for a guest

   
    public ArrayList<String> list_of_quests() throws RemoteException;//returns list of quests

    public String revenue() throws RemoteException;//returns the total revenue of the hotel
}
