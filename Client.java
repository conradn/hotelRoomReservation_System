/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author timothywanyaiye
 */

import java.rmi.*;
import java.util.Scanner;


public class Client {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RoomManagerImp obj1 = (RoomManagerImp)Naming.lookup("Revenue");
        RoomManagerImp obj4 = (RoomManagerImp)Naming.lookup("List");

        System.out.println(".....................Rooms Available......................................");

        System.out.println();
        
        int v=6;
        int w=13;
        int x=2;
        int y=0;
        int z=1;

        System.out.println(v + " rooms of type 0 are available for 55,000 UGX per night "
                            + w +" rooms of type 1 are available for 75,000 UGX per night"
                            + x +" rooms of type 2 are available for 80,000 UGX per night"
                            + y + " rooms of type 3 are available for 150,000 UGX per night"
                            + z +" rooms of type 4 are available for 230,000 UGX per night ");
        
        System.out.println("Book a room: ");
        String a = sc.nextLine();
        System.out.println("Thank you. \n You booked " +a);
        
        int total=0;
        String a;
        if(a == v){
            total =  v -1;
        }else if(a== w){
            total =  w -1;
        }else if(y== x){
            total =  x -1;
        }else if(y== y){
            total =  v -1;
        }
        
        
    }
}
