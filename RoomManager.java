import java.rmi.*;
public interface RoomManager{

    public void addGuest(String roomName, String guestName) throws RemoteException;//add guest to room
    public void removeGuest(String roomName, String guestName) throws RemoteException;//remove guest from room
    public void printRooms() throws RemoteException; // print all rooms and guests in each room
    public void printGuests() throws RemoteException; // print all guests and rooms they are in
    public void printrevenue() throws RemoteException; // print total revenue of all rooms
    public void printavailable() throws RemoteException; // print all rooms that are available
    
}