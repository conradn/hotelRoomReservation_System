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
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RoomManager extends Remote {

    /**
     *
     * @param room_type
     * @return
     * @throws RemoteException
     */
    public String available_rooms(String room_type) throws RemoteException;

    /**
     *
     * @param room_type
     * @param quest
     * @return
     * @throws RemoteException
     */
    public String book_room(String room_type,String quest) throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException
     */
    public ArrayList<String> list_of_quests() throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException
     */
    public String revenue() throws RemoteException;
}
