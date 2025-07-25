/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_airline;
/**
 *
 * @author rofidah
 */
import java.util.*;
public class OurFleet extends FlightShows {
    //Attribute
    private String OurFleet;
    private int NumberofSeats;
    private String TypesofSeats;
    private int Length;
    private int Wingspan;
    private int CruisingSpeed;
// constructure
    public OurFleet(String OurFleet, int NumberofSeats, String TypesofSeats, int Length, int Wingspan, int CruisingSpeed) {
        this.OurFleet = OurFleet;
        this.NumberofSeats = NumberofSeats;
        this.TypesofSeats = TypesofSeats;
        this.Length = Length;
        this.Wingspan = Wingspan;
        this.CruisingSpeed = CruisingSpeed;
    }
    public OurFleet(){
        
    }
/**
 * this method to get the name of the fleet
 * @return OurFleet 
 */
    public String getOurFleet() {
        return OurFleet;
    }
/**
 * this method to set OurFleet
 * @param OurFleet 
 */
    public void setOurFleet(String OurFleet) {
        this.OurFleet = OurFleet;
    }
/**
 * this method to get the number of seats
 * @return NumberofSeats
 */
    public int getNumberofSeats() {
        return NumberofSeats;
    }
/**
 * this method to set NumberofSeats 
 * @param NumberofSeats 
 */
    public void setNumberofSeats(int NumberofSeats) {
        this.NumberofSeats = NumberofSeats;
    }
/**
 * this method to get the types of seats
 * @return TypesofSeats
 */
    public String getTypesofSeats() {
        return TypesofSeats;
    }
/**
 * this method to set TypesofSeats 
 * @param TypesofSeats 
 */
    public void setTypesofSeats(String TypesofSeats) {
        this.TypesofSeats = TypesofSeats;
    }
/**
 * this method to get the length of the fleet
 * @return Length
 */
    public int getLength() {
        return Length;
    }
/**
 * this method to set Length
 * @param Length 
 */
    public void setLength(int Length) {
        this.Length = Length;
    }
/**
 * this method to get the wingspan for the fleet
 * @return Wingspan
 */
    public int getWingspan() {
        return Wingspan;
    }
/**
 * this method to set Wingspan
 * @param Wingspan 
 */
    public void setWingspan(int Wingspan) {
        this.Wingspan = Wingspan;
    }
/**
 * it's a method to get the Cruising speed for the fleet
 * @return CruisingSpeed
 */
    public int getCruisingSpeed() {
        return CruisingSpeed;
    }
/**
 * this method to set CruisingSpeed
 * @param CruisingSpeed 
 */
    public void setCruisingSpeed(int CruisingSpeed) {
        this.CruisingSpeed = CruisingSpeed;
    }
    /**
     *
     * @return
     */
    public static String seats(){
     System.out.println("choose your seat"); 
     Scanner input = new Scanner(System.in);
     String str = input.next(); 
        for(int i = 0; 0<10; i++){
        if(str .equals("H1") ||  str.equals("H3") || str.equals("H4") || str.equals("H7")|| str.equals("H8")|| str.equals("H9")||str.equals("B1") || str.equals("B2") || str.equals("B3") || str.equals("H6")||str.equals("A2") || str.equals("A3")||  str.equals("A4")){
            System.out.println("your seat has been selected successfully");
              break;
        }else{ 
        if(str.equals("H2") ||str.equals("H5")|| str.equals("H6") || str.equals("H10") || str.equals("B4") || str.equals("B5") || str.equals("A1")){
                 System.out.println(" the seat is unavailable choose another seat "); 
                   str = input.next(); 
                 continue;
                  } 
        }
        }
        return "";
    }
    @Override
    public void Booking() {
        super.Booking(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public  String Business() {
        return super.Business(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String Economic() {
        return super.Economic(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String FirstClass() {
        return super.FirstClass(); //To change body of generated methods, choose Tools | Templates.
    }
   
     /**
      * this method to inform the passenger about the seat information
      * @return nothing
      */
     public static void tyOfs(){              
         System.out.println(" Enter the type of seat again ");
         Scanner input = new Scanner(System.in);
         int choice = input.nextInt();
        switch (choice) { 
            case 1:
                System.out.println(" your seat will be in range 'A' from 1 to 4 for example 'A1' ");
                break;
            case 2:
                System.out.println(" your seat will be in range 'B' from 1 to 6 for example 'B1'");
                break;
            case 3:
                System.out.println(" your seat will be in range 'H' from 1 to 10 for example 'H1' ");
                break;
            default:
                break;
        }
     }
     /**
      * a method to let the passenger rate our airline
      * @return nothing
      */
     public static String Rate(){
          Scanner input = new Scanner(System.in);
         System.out.println("From 1 to 5 how satisfied are you \n" +
                 "1- Very dissatisfied \n"+
                 "2- dissatisfied\n"+
                 "3- unsure \n"+
                 "4- satisfied\n"
            +"5- Very satisfied "  );
         int num2 = input.nextInt();
         switch(num2){
             case 1:
                 System.out.println("we are sorry that you've had to deal with the issue");
                 break;
             case 2:
                 System.out.println("we are sorry that you've had to deal with the issue");
                 break;
             case 3:
                 System.out.println("we are sorry that you've had to deal with the issue");
                 break;
             case 4:
                 System.out.println("Thank you and we hope you fly with us again ");
                 break;
             case 5:
                 System.out.println("Thank you and we hope you fly with us again ");
                 break;
            default:
                break;
         }
         return "";
     }
    /**
     *
     * @param pl
     * @return
     */
    public int compareTo(OurFleet pl) {
         if(this.Wingspan < pl.Wingspan)
     return 1;
     else if (this.Wingspan == pl.Wingspan)
         return 0;
     else
         return -1;
    }
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OurFleet other = (OurFleet) obj;
        if (this.Length != other.Length) {
            return false;
        }
        return true;
    }
      

    @Override
    public String toString() {
        return  "the fleet is : " + OurFleet + "\n The number of seats is : " + NumberofSeats + "\n " + TypesofSeats + "\n The length is : " + Length + "\n The  Wingspan is : " + Wingspan + "\n The Cruising Speed : " + CruisingSpeed ;
    }
   
}
