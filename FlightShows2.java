/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_airline;

/**
 *
 * @author Shooq
 */
import java.util.*;
public class FlightShows {
    //Attributes//صفات 
    //حجز الرحله
    private String flightbooking;
    private int Booking;
     public FlightShows(String flightbooking, int Booking ) {
        this.flightbooking = flightbooking;
        this.Booking = Booking;
    }
    FlightShows() {
       
    }
    /**
     *
     * @return
     */
    public int getBooking() {
        return Booking;
    }
    /**
     *
     * @param Booking
     */
    public void setBooking(int Booking) {
        this.Booking = Booking;
    }
    /**
     *
     * @return
     */
    public String getFlightbooking() {
        return flightbooking;
    }
    /**
     *
     * @param flightbooking
     */
    public void setFlightbooking(String flightbooking) {
        this.flightbooking = flightbooking;
    }
    public void Booking() {
      try{ 
          Scanner n = new Scanner(System.in);
        System.out.println("choose the type of seat:\n 1-firstClass\n 2-Business class \n 3-Econamy class");
        int x = n.nextInt();
        switch (x) {
            case 1:
                System.out.println(FirstClass());
                break;
            case 2:
                System.out.println(Business());
                break;
            case 3:
                System.out.println(Economic());
                break;
            default:
                System.out.println("didnt found");
                break;}}
        catch(Exception e){
                System.out.println(e);
                }
        }
    /**
     *
     * @return
     */
    public String FirstClass() {
        String str = "The price of the trip is : 154 SR \n To refund the ticket:70 SR\n if you missed the flight:50% of the price will return to you \n service,food and drinks: includes,seat selection:Free";
        System.out.println(str);
        return "";
    }
    /**
     *
     * @return
     */
    public String Business() {
        Scanner t = new Scanner(System.in);
        System.out.println("choose:\n 1-essential \n 2-special");
        int i = t.nextInt();
        switch (i) {
            case 1:
                System.out.println("The price of the trip is: 90.50 SR\n To refund the ticket:70 SR \n if you missed the flight:50% of the price will return to you \n service,food and drinks: includes,seat selection:Free");
                break;
            case 2:
                System.out.println("The price of the trip is : 1 SR\n To refund the ticket:140 SR \n if you missed the flight:50% of the price will return to you \n service,food and drinks: includes,seat selection:Free");
                break;
            default:
                System.out.println("didnt found");
                break;
        }
        return "";
    }
    /**
     *
     * @return
     */
    public String Economic() {
        Scanner q = new Scanner(System.in);
        System.out.println("choose:\n 1-essential\n 2-special");
        int e = q.nextInt();
        switch (e) {
            case 1:
                System.out.println("The price of the trip is : 57 SR\n To refund the ticket:28 SR \n if you missed the flight:50% of the price will return to you \n service,food and drinks: includes,seat selection:20 SR");
                break;
            case 2:
                System.out.println("The price of the trip is : 80.5 SR\n To refund the ticket:137 SR \n if you missed the flight:50% of the price will return to you \n service,food and drinks: includes,seat selection:30 SR");
                break;
            default:
                System.out.println("didnt found");
                break;
        }
        return "";
    }
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "FlightShows{" + "flighbooking=" + flightbooking + ", booking=" + Booking + '}';
    }     
}
