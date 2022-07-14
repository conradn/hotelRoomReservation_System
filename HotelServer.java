/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.rmi_hotel_mgt;

/**
 *
 * @author HP
 */

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry; 


public class HotelServer {
     public static void main(String[] args) throws RemoteException{
        try{
            Registry port = LocateRegistry.createRegistry(1090);
            port.rebind("hello",new RoomManagerImpl());
        }catch (RemoteException e){
            System.out.println("Something is wrong:" + e);
        }
        finally{
             System.out.print("Server has been triggered");
        }
    }
}
