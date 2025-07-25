/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_airline;

import java.util.*;

/*Name:Mohammed Alzahrani
ID:439014919
 */
public class Airports {
/**
     *
     * @return
     */
  
   //Attributes//صفات 
    private String nameAriport;//اسم المطار
    private String AirportLocation;//مكان المطار
    private int time;// الوقت
    /**
     *
     * @param nameAriport
     * @param AriportLocation
     * @param time
     */
    Airports(String nameAriport,String AriportLocation,int time ){//constructors 
        this.nameAriport= nameAriport;
        this.AirportLocation= AriportLocation;
        this.time= time;  
    }
    /**
     *
     */
    public Airports() {
        
    }
    /**
     *
     * @return nameAriport
     */
    public String getnameAriport(){
        return  nameAriport;   
    }
    /**
     *
     * @param nameAriport
     */
    public void setnameAriport(String nameAriport){
        this.nameAriport= nameAriport;
    }
    /**
     *
     * @return AriportLocation
     */
    public  String getAirportLocation(){
        return AirportLocation;   
    }
    /**
     *
     * @param AirportLocation
     */
    public void setAriportLocation( String AirportLocation){
        this.AirportLocation= AirportLocation;
        this.internationalAirport();
        this.localAirport();
    }
    /**
     *
     * @return AirportArea
     */
    public int gettime(){
        return  time;
    }
    /**
     *
     * @param time
     */
    public void settime(int time){
       this.time=time ;
    }
    /**
     *
     */
    public void internationalAirport(){//مطار دولي
         System.out.println("Jeddah");
         System.out.println("Dammam");
         System.out.println("dubai");
         System.out.println("Egypt");
        Airports.Tarmac();//في المطار الدولي في مدرج الاقلاع
        Airports.LandingRunway();//ومدرج الهبوط
    }
    /**
     *
     */
    public void localAirport(){//مطار محلي
        System.out.println("Al Baha");
        Airports.Tarmac();//في المطار المحلي في مدرج الاقلاع 
        Airports.LandingRunway();//ومدرج الهبوط
       
    }
    /**
     *
     * @return area
     */
   
    /**
     *
     */
    public String Destination(){//الوجهة 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter your destination:* Jeeddah ,Dammam,dubai,Egypt,Al Baha,* ");
        String Destinati = in.nextLine();
       
        if (Destinati.equals("Jeeddah") || Destinati.equals("Dammam") || Destinati.equals("dubai") || Destinati.equals("Egypt")) {
            System.out.println("internationalAirport");
            switch (Destinati) {
                case "Jeeddah":
                    System.out.println("The name of Airpot king Abduaziz");
                    break;
                case "Dammam":
                    System.out.println("The name of Airpot king Fahd");
                    break;
                case "dubai":
                    System.out.println("The name of Airpot dubai ");
                    break;
                case "Egypt":
                    System.out.println("The name of Airpot Cairo");

                    break;
                default:
                    throw new AssertionError();
            }
        }
        else if (Destinati.equals("Al Baha") ){
            System.out.println("localAirport");
            System.out.println("The name of Airpot King Saud");
        }
        else{
            System.out.println("worng choice!!!!");
        }
        return "";
    }
    
     public void Time(){//الاوقات المتاحهه
        System.out.println("Choose the right time for you \nAnd these available times: ");
        ArrayList<String> time = new ArrayList();
        time.add("5:00 am");
        time.add("21:00 pm");
        time.add("2:05 am");
          for(String i:time ){
              System.out.println(i);  
          }
    }
    /**
     *
     */
    public static void Tarmac(){//مدرج الاقلاع   
    }      
    /**
     *
     */
    public static void LandingRunway(){//مدرج الهبوط
    }
      @Override
    public String toString() {
        return "Airports{" + "nameAriport= " + nameAriport + ", AirportLocation= " + AirportLocation + ", time= " + time+ "Destination= " + Destination() + '}';
    }
}
