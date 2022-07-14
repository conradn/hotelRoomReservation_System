
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
//this class is the implementation of the interface RoomManager
public class RoomManagerImpl extends UnicastRemoteObject implements RoomManager {

   //rooms
    private int type_0_rooms = 10;
    private int type_1_rooms = 20;
    private int type_2_rooms = 5;
    private int type_3_rooms = 3;
    private int type_4_rooms = 2;

   //prices
    private final long type_0_rooms_price = 55000;
    private final long type_1_rooms_price = 75000;
    private final long type_2_rooms_price = 80000;
    private final long type_3_rooms_price = 150000;
    private final long type_4_rooms_price = 230000;

    /**
     *
     * @guests
     */
    ArrayList<String> type_0_rooms_guests = new ArrayList<>();
    ArrayList<String> type_1_rooms_guests = new ArrayList<>();
    ArrayList<String> type_2_rooms_guests = new ArrayList<>();
    ArrayList<String> type_3_rooms_guests = new ArrayList<>();
    ArrayList<String> type_4_rooms_guests = new ArrayList<>();
    ArrayList<String> all_guests = new ArrayList<>();

    private String revenue;
    
    private String available_rooms;


    public RoomManagerImpl() throws RemoteException {
        super();
    }


   
    //returns the available rooms of a given type
    public int getType_0_rooms() {
        return type_0_rooms;
    }

    //
    public void setType_0_rooms() {
        this.type_0_rooms = this.type_0_rooms - 1;
    }

    
    public int getType_1_rooms() {
        return type_1_rooms;
    }

    
    public void setType_1_rooms() {
        this.type_1_rooms = this.type_1_rooms - 1;
    }

    
    public int getType_2_rooms() {
        return type_2_rooms;
    }

    
    public void setType_2_rooms() {
        this.type_2_rooms = this.type_2_rooms - 1;
    }

    
    public int getType_3_rooms() {
        return type_3_rooms;
    }

    
    public void setType_3_rooms() {
        this.type_3_rooms = this.type_3_rooms - 1;
    }

    
    public int getType_4_rooms() {
        return type_4_rooms;
    }

    
    public void setType_4_rooms() {
        this.type_4_rooms = this.type_4_rooms - 1;
    }

    
    public long getType_0_rooms_price() {
        return type_0_rooms_price;
    }

    
    public long getType_1_rooms_price() {
        return type_1_rooms_price;
    }

    
    public long getType_2_rooms_price() {
        return type_2_rooms_price;
    }

    
    public long getType_3_rooms_price() {
        return type_3_rooms_price;
    }

    
    public long getType_4_rooms_price() {
        return type_4_rooms_price;
    }

     
    public String getType_0_rooms_price_string() {
        return "55,000 UGX per night";
    }

    
    
    public String getType_1_rooms_price_string() {
        return "75,000 UGX per night";
    }

    
    public String getType_2_rooms_price_string() {
        return "80,000 UGX per night";
    }

    
    public String getType_3_rooms_price_string() {
        return "150,000 UGX per night";
    }

    
    public String getType_4_rooms_price_string() {
        return "230,000 UGX per night";
    }
    

    
    public ArrayList<String> getType_0_rooms_guests() {
        return type_0_rooms_guests;
    }

    
    public ArrayList<String> getType_1_rooms_guests() {
        return type_1_rooms_guests;
    }

    
    public ArrayList<String> getType_2_rooms_guests() {
        return type_2_rooms_guests;
    }

    
    public ArrayList<String> getType_3_rooms_guests() {
        return type_3_rooms_guests;
    }

    
    public ArrayList<String> getType_4_rooms_guests() {
        return type_4_rooms_guests;
    }

   // public ArrayList<String> getAll_guests() {
    //     return all_guests;
    // }
    //checking for available rooms of all types 
    @Override
    public String available_rooms(String room_type) throws RemoteException {
        switch (room_type) {
            case "0":
                this.available_rooms = this.getType_0_rooms() + " rooms of type 0 for " + this.getType_0_rooms_price_string();
                break;
            case "1":
                this.available_rooms = this.getType_1_rooms() + " rooms of type 1 for " + this.getType_1_rooms_price_string();
                break;
            case "2":
                this.available_rooms = this.getType_2_rooms() + " rooms of type 2 for " + this.getType_2_rooms_price_string();
                break;
            case "3":
                this.available_rooms = this.getType_3_rooms() + " rooms of type 3 for " + this.getType_3_rooms_price_string();
                break;
            case "4":
                this.available_rooms = this.getType_4_rooms() + " rooms of type 4 for " + this.getType_4_rooms_price_string();
                break;

        }

        return this.available_rooms;
    }

    //implementation of the booking interface
    @Override
    public String book_room(String room_type, String guest) throws RemoteException {

        String msg = "Added successfully";
//        System.out.println("Room type: " + room_type);
//        System.out.println("Guest: " + guest);

//checking if the room is available and assigning the room to the guest
        switch (room_type) {
            case "0":
                if (this.getType_0_rooms() > 0) {
                    this.setType_0_rooms();
                    this.type_0_rooms_guests.add(guest);
                } else {
                    msg = "Rooms of type 0 are filled up";
                }

                break;
            case "1":
                if (this.getType_1_rooms() > 0) {
                    this.setType_1_rooms();
                    this.type_1_rooms_guests.add(guest);
                } else {
                    msg = "Rooms of type 1 are filled up";
                }

                break;
            case "2":
                if (this.getType_2_rooms() > 0) {
                    this.setType_2_rooms();
                    this.type_2_rooms_guests.add(guest);
                } else {
                    msg = "Rooms of type 2 are filled up";
                }

                break;
            case "3":
                if (this.getType_3_rooms() > 0) {
                    this.setType_3_rooms();
                    this.type_3_rooms_guests.add(guest);
                } else {
                    msg = "Rooms of type 3 are filled up";
                }

                break;
            case "4":
                if (this.getType_4_rooms() > 0) {
                    this.setType_4_rooms();
                    this.type_4_rooms_guests.add(guest);
                } else {
                    msg = "Rooms of type 4 are filled up";
                }

                break;

        }

        return msg;

    }

   //implentation of the List_of_guests interface
    @Override
    public ArrayList<String> list_of_guests() throws RemoteException {
        this.getType_0_rooms_guests().forEach(name -> {
            this.all_guests.add(name);
        });

        this.getType_1_rooms_guests().forEach(name -> {
            this.all_guests.add(name);
        });

        this.getType_2_rooms_guests().forEach(name -> {
            this.all_guests.add(name);
        });

        this.getType_3_rooms_guests().forEach(name -> {
            this.all_guests.add(name);
        });

        this.getType_4_rooms_guests().forEach(name -> {
            this.all_guests.add(name);
        });

        return this.all_guests;

    }

  //implementation of revenue interface
    @Override
    public String revenue() throws RemoteException {
        long type_0_revenue = this.type_0_rooms_guests.size() * this.type_0_rooms_price;
        long type_1_revenue = this.type_1_rooms_guests.size() * this.type_1_rooms_price;
        long type_2_revenue = this.type_2_rooms_guests.size() * this.type_2_rooms_price;
        long type_3_revenue = this.type_3_rooms_guests.size() * this.type_3_rooms_price;
        long type_4_revenue = this.type_4_rooms_guests.size() * this.type_4_rooms_price;

        revenue = this.type_0_rooms_guests.size() + " TYPE 0 ROOMS BOOKED AND REVENUE IS " + type_0_revenue + "\n";
        revenue += this.type_1_rooms_guests.size() + " TYPE 1 ROOMS BOOKED AND REVENUE IS " + type_1_revenue + "\n";
        revenue += this.type_2_rooms_guests.size() + " TYPE 2 ROOMS BOOKED AND REVENUE IS " + type_2_revenue + "\n";
        revenue += this.type_3_rooms_guests.size() + " TYPE 3 ROOMS BOOKED AND REVENUE IS " + type_3_revenue + "\n";
        revenue += this.type_4_rooms_guests.size() + " TYPE 4 ROOMS BOOKED AND REVENUE IS " + type_4_revenue + "\n";

        return revenue;
    }

}



   

    

    
