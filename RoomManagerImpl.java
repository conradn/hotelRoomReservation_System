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
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class RoomManagerImpl extends UnicastRemoteObject implements RoomManager {

    /**
     *
     * @available rooms
     */
    private int type_0_rooms = 10;
    private int type_1_rooms = 20;
    private int type_2_rooms = 5;
    private int type_3_rooms = 3;
    private int type_4_rooms = 2;

    /**
     *
     * @price range for each type of room
     */
    private final long type_0_rooms_price = 55000;
    private final long type_1_rooms_price = 75000;
    private final long type_2_rooms_price = 80000;
    private final long type_3_rooms_price = 150000;
    private final long type_4_rooms_price = 230000;

    /**
     *
     * @quests
     */
    ArrayList<String> type_0_rooms_quests = new ArrayList<>();
    ArrayList<String> type_1_rooms_quests = new ArrayList<>();
    ArrayList<String> type_2_rooms_quests = new ArrayList<>();
    ArrayList<String> type_3_rooms_quests = new ArrayList<>();
    ArrayList<String> type_4_rooms_quests = new ArrayList<>();
    ArrayList<String> all_quests = new ArrayList<>();

    /**
     *
     * @revenue
     */
    private String revenue;
    
     /**
     *
     * @revenue
     */
    private String available_rooms;


    public RoomManagerImpl() throws RemoteException {
        super();
    }

    /**
     *
     * @param rooms
     * @return
     * @throws RemoteException
     */
    /**
     *
     * @return
     */
    public int getType_0_rooms() {
        return type_0_rooms;
    }

    /**
     *
     */
    public void setType_0_rooms() {
        this.type_0_rooms = this.type_0_rooms - 1;
    }

    /**
     *
     * @return
     */
    public int getType_1_rooms() {
        return type_1_rooms;
    }

    /**
     *
     */
    public void setType_1_rooms() {
        this.type_1_rooms = this.type_1_rooms - 1;
    }

    /**
     *
     * @return
     */
    public int getType_2_rooms() {
        return type_2_rooms;
    }

    /**
     *
     */
    public void setType_2_rooms() {
        this.type_2_rooms = this.type_2_rooms - 1;
    }

    /**
     *
     * @return
     */
    public int getType_3_rooms() {
        return type_3_rooms;
    }

    /**
     *
     */
    public void setType_3_rooms() {
        this.type_3_rooms = this.type_3_rooms - 1;
    }

    /**
     *
     * @return
     */
    public int getType_4_rooms() {
        return type_4_rooms;
    }

    /**
     *
     */
    public void setType_4_rooms() {
        this.type_4_rooms = this.type_4_rooms - 1;
    }

    /**
     *
     * @return
     */
    public long getType_0_rooms_price() {
        return type_0_rooms_price;
    }

    /**
     *
     * @return
     */
    public long getType_1_rooms_price() {
        return type_1_rooms_price;
    }

    /**
     *
     * @return
     */
    public long getType_2_rooms_price() {
        return type_2_rooms_price;
    }

    /**
     *
     * @return
     */
    public long getType_3_rooms_price() {
        return type_3_rooms_price;
    }

    /**
     *
     * @return
     */
    public long getType_4_rooms_price() {
        return type_4_rooms_price;
    }

    /**
     *
     * @return
     */
    public String getType_0_rooms_price_string() {
        return "55,000 UGX per night";
    }

    /**
     *
     * @return
     */
    public String getType_1_rooms_price_string() {
        return "75,000 UGX per night";
    }

    /**
     *
     * @return
     */
    public String getType_2_rooms_price_string() {
        return "80,000 UGX per night";
    }

    /**
     *
     * @return
     */
    public String getType_3_rooms_price_string() {
        return "150,000 UGX per night";
    }

    /**
     *
     * @return
     */
    public String getType_4_rooms_price_string() {
        return "230,000 UGX per night";
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getType_0_rooms_quests() {
        return type_0_rooms_quests;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getType_1_rooms_quests() {
        return type_1_rooms_quests;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getType_2_rooms_quests() {
        return type_2_rooms_quests;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getType_3_rooms_quests() {
        return type_3_rooms_quests;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getType_4_rooms_quests() {
        return type_4_rooms_quests;
    }

    /**
     *
     * @param room_type
     * @return
     * @throws RemoteException
     */
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

    /**
     *
     * @param room_type
     * @param quest
     * @return
     * @throws RemoteException
     */
    @Override
    public String book_room(String room_type, String quest) throws RemoteException {

        String msg = "Added successfully";

        switch (room_type) {
            case "0":
                if (this.getType_0_rooms() > 0) {
                    this.setType_0_rooms();
                    this.type_0_rooms_quests.add(quest);
                } else {
                    msg = "Rooms of type 0 are filled up";
                }

                break;
            case "1":
                if (this.getType_1_rooms() > 0) {
                    this.setType_1_rooms();
                    this.type_1_rooms_quests.add(quest);
                } else {
                    msg = "Rooms of type 1 are filled up";
                }

                break;
            case "2":
                if (this.getType_2_rooms() > 0) {
                    this.setType_2_rooms();
                    this.type_2_rooms_quests.add(quest);
                } else {
                    msg = "Rooms of type 2 are filled up";
                }

                break;
            case "3":
                if (this.getType_3_rooms() > 0) {
                    this.setType_3_rooms();
                    this.type_3_rooms_quests.add(quest);
                } else {
                    msg = "Rooms of type 3 are filled up";
                }

                break;
            case "4":
                if (this.getType_4_rooms() > 0) {
                    this.setType_4_rooms();
                    this.type_4_rooms_quests.add(quest);
                } else {
                    msg = "Rooms of type 4 are filled up";
                }

                break;

        }

        return msg;

    }

    /**
     *
     * @return @throws RemoteException
     */
    @Override
    public ArrayList<String> list_of_quests() throws RemoteException {
        this.getType_0_rooms_quests().forEach(name -> {
            this.all_quests.add(name);
        });

        this.getType_1_rooms_quests().forEach(name -> {
            this.all_quests.add(name);
        });

        this.getType_2_rooms_quests().forEach(name -> {
            this.all_quests.add(name);
        });

        this.getType_3_rooms_quests().forEach(name -> {
            this.all_quests.add(name);
        });

        this.getType_4_rooms_quests().forEach(name -> {
            this.all_quests.add(name);
        });

        return this.all_quests;

    }

    /**
     *
     * @return @throws RemoteException
     */
    @Override
    public String revenue() throws RemoteException {
        long type_0_revenue = this.type_0_rooms_quests.size() * this.type_0_rooms_price;
        long type_1_revenue = this.type_1_rooms_quests.size() * this.type_1_rooms_price;
        long type_2_revenue = this.type_2_rooms_quests.size() * this.type_2_rooms_price;
        long type_3_revenue = this.type_3_rooms_quests.size() * this.type_3_rooms_price;
        long type_4_revenue = this.type_4_rooms_quests.size() * this.type_4_rooms_price;

        revenue = this.type_0_rooms_quests.size() + " TYPE 0 ROOMS BOOKED AND REVENUE IS " + type_0_revenue + "\n";
        revenue += this.type_1_rooms_quests.size() + " TYPE 1 ROOMS BOOKED AND REVENUE IS " + type_1_revenue + "\n";
        revenue += this.type_2_rooms_quests.size() + " TYPE 2 ROOMS BOOKED AND REVENUE IS " + type_2_revenue + "\n";
        revenue += this.type_3_rooms_quests.size() + " TYPE 3 ROOMS BOOKED AND REVENUE IS " + type_3_revenue + "\n";
        revenue += this.type_4_rooms_quests.size() + " TYPE 4 ROOMS BOOKED AND REVENUE IS " + type_4_revenue + "\n";

        return revenue;
    }

}
