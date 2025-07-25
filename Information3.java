
package oop_airline;
import java.util.Scanner;
/**
 *
 * @author rehab
 */
public class Information extends TripAbstract{
    Scanner scan = new Scanner(System.in);
     private int siz_bag;
     private int number_bag;
    /**
     *
     * @return
     */
    public int getsiz_bag()
    {
    return siz_bag;
    }
    /**
     *
     * @param siz_bag
     */
    public void setsiz_bag(int siz_bag)
    {
    this.siz_bag=siz_bag;
    }
    /**
     *
     * @return
     */
    public int getnumber_bag()
    {
    return number_bag;
    }
    /**
     *
     * @param number_bag
     */
    public void setnumber_bag(int number_bag)
    {
    this.number_bag=number_bag;
    }
    /**
     *
     * @return
     */
    public double Handbag(){
   System.out.println("how many Hand bag do you have ?"); 
          int t = scan.nextInt();
          setnumber_bag(t);
          int f = getnumber_bag();
         while((f > 1))
         {
         System.out.println("the maximum number of Hand bag is 1 please try again "); 
         t=scan.nextInt();
          setnumber_bag(t);
          f = getnumber_bag();
         }
          System.out.println("what is the size of each Hand bag ? "); 
          int d = scan.nextInt();
          setsiz_bag(t);
          int s= getsiz_bag();
         while(s > 5)
         {
         System.out.println("the maximum size of Hand bag is 5 KG please try again "); 
         d=scan.nextInt();
          setsiz_bag(d);
          s=getsiz_bag();
         }
         System.out.println("ok");
         return 0;}
    public double luggage(){
          System.out.println("how many luggage do you have ? "); 
          int t = scan.nextInt();
          setnumber_bag(t);
          int f = getnumber_bag();
         while(f > 2)
         {
         System.out.println("the maximum number of luggage is 2 please try again "); 
         t=scan.nextInt();
          setnumber_bag(t);
          f = getnumber_bag();
         }       
          System.out.println("what the size of each bag ? "); 
          int d = scan.nextInt();
          setsiz_bag(t);
          int s= getsiz_bag();
          
         while((s>23))
         {
         System.out.println("the maximum size of bag is 23 KG please try again "); 
         d=scan.nextInt();
          setsiz_bag(d);
          s=getsiz_bag();
         }
         System.out.println("ok");
        return 0;
}
    @Override
    public void desplay() {       
        System.out.println("--------Enter Details of the size of bag -------- "); 
        System.out.println("\t      --------Nots -------- "); 
        System.out.println("1-each passenger should have only 2 Hand bag "); 
        System.out.println("2-each Hand bag shoud be only 5 killos ");
        System.out.println("3-each passenger should have only 2 luggage "); 
        System.out.println("4-The weight of one piece should not exceed 23KG ( 70lbs ).");
        System.out.println(" 138 SAR shall be added as an excess baggage fee per piece .");
}   
    }
