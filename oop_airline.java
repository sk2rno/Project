package oop_airline;
import java.util.*;
/**
 *
 * @author riyam
 */
public class Oop_Airline {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Welcome to OOP Airline 'The best airline ever' , we wish you a pleassant experience and a pleassant flight :) ");
        /*
        sahlah main
        */
        Airports obj = new Airports();
         obj.toString();
         obj.Time();
        String t = in.nextLine();
        System.out.println("Your flight time is:"+t); 
         System.out.println("");
         ///////////////////////////////////////////////////////////////////
         /*
         rehab main
         */ 
        System.out.println("---------------------------------Baggage Allowances: ---------------------------------------");
        Information i = new Information();
             i.desplay( );
             i.Handbag();
             i.luggage();
             System.out.println("");
         ///////////////////////////////////////////////////////////////
         /*
         rofidah and Shooq main
         */
         System.out.println("============================================================================================================================\n");   
         OurFleet o = new OurFleet();
         o.Booking();
         OurFleet.tyOfs();
        System.out.println(OurFleet.seats());
        System.out.println("");
         ///////////////////////////////////////////////////////////////////
         /*
         asayel main
         */
        PlaneServices ps=new PlaneServices(true);
        System.out.println("\t\t**Plane Services**");
        System.out.println("1-display menu ? ");
        System.out.println("2-display number of plane seats");
        System.out.println("3-change seats");
        System.out.println("4-Is there a prayer area?");
        int choose=in.nextInt();
        switch(choose) {
            case 1: 
                ps.desplay();
                break;
            case 2:
                System.out.println(ps.getNoOfSeats());
                break;
            case 3:
                ps.ReplaceSeat();
                break;
            case 4:
                System.out.println(ps.isParyArea());
                break;
                default:
                System.out.println("worng choose");
        }
        System.out.println("");
        ////////////////////////////////////////////////////////////////////////
        /*
        rofidah and Shooq main2
        */
    OurFleet f1 = new OurFleet("Boeing B777-368ER ",  20  , "4 First Class and 6 business Class and 10 economy Class " , 259 ,  213 ,  493);
    OurFleet f2 = new OurFleet("Boeing B777-268 ",  232 , " 24 First Class and 38 business Class and 170 economy Class " ,  209  ,  200 ,  490 );
    OurFleet f3 = new OurFleet("Airbus A330-300 " , 298 , "36 Business Class and 262 economy Class " ,  209 ,  198 ,  470 );
    OurFleet f4 = new OurFleet("Boeing B787-9 Dreamliner " ,  116 , "24 Business Class and 274 economy Class " ,  209 ,  197 , 447 );
    OurFleet f5 = new OurFleet("Airbus A320 " ,  116 , "20 Business Class and 96 economy Class " ,   123 ,   112 ,  447 );
    ArrayList<OurFleet> array = new ArrayList();
    array.add(f1);
    array.add(f2);
    array.add(f3);
    array.add(f4);
    array.add(f5);
       System.out.println("to know more type More if not type exit");
       String st = in.next();
       if(st.equals("More")){
            System.out.println("            Fleet information           \n");
        System.out.println("============================================================================================================================" +"\n");
         for(OurFleet f : array){
             System.out.println(f);  
         }
       }else{
           if ( st.equals("exit")){
               
           }
       }
           System.out.println("============================================================================================================================" +"\n");
           System.out.println(OurFleet.Rate());
           System.out.println("\t---------------||||||||||||||||Have a safe flight||||||||||||||||---------------");
    }   
}
