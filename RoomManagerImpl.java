import java.rmi.*;

public class RoomManagerImpl extends java.rmi.server.UnicastRemoteObject implements RoomManager {
    public RoomManagerImpl() throws RemoteException {
        super();
    }
    public void addGuest(String roomName, String guestName) throws RemoteException {
        Room room = RoomManager.getRoom(roomName);
        room.addGuest(guestName);
    }
    public void removeGuest(String roomName, String guestName) throws RemoteException {
        Room room = RoomManager.getRoom(roomName);
        room.removeGuest(guestName);
    }
    public void printRooms() throws RemoteException {
        for (Room room : RoomManager.getRooms()) {
            System.out.println(room.getName() + ": " + room.getGuests());
        }
    }
    public void printGuests() throws RemoteException {
        for (Room room : RoomManager.getRooms()) {
            System.out.println(room.getName() + ": " + room.getGuests());
        }
    }
    public void printrevenue() throws RemoteException {
        for (Room room : RoomManager.getRooms()) {
            System.out.println(room.getName() + ": " + room.getRevenue());
        }
    }
    public void printavailable() throws RemoteException {
        for (Room room : RoomManager.getRooms()) {
            if (room.isAvailable()) {
                System.out.println(room.getName());
            }
        }
    }
}
    

