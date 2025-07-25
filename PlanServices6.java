package oop_airline;

import java.util.*;
public class PlaneServices extends OurFleet implements Tripinterface { 
Scanner in = new Scanner(System.in);
  // عدد المقاعد  
private String noOfSeats;
// قائمة الطعام الخاصة لدرجة الاقتصادية
private ArrayList <String> menuEatOfEconomic= new ArrayList();
// قائمة الطعام الخاصة لدرجة الاعمال
private ArrayList <String> menuEatOfBusiness= new ArrayList();
// قائمة الطعام الخاصة للدرجة الأولى
private ArrayList <String> menuEatOfFirstclass= new ArrayList();
// قائمة المقاعد الذى تريد التبديل
private ArrayList <String> changeSeats= new ArrayList();
private boolean  paryArea;
    public PlaneServices(String noOfSeats, String OurFleet, int NumberofSeats, String TypesofSeats, int Length, int Wingspan, int CruisingSpeed) {
        super(OurFleet, NumberofSeats, TypesofSeats, Length, Wingspan, CruisingSpeed);
        this.noOfSeats = noOfSeats;
    }
    public PlaneServices( boolean paryArea) {
        this.paryArea = paryArea;
    }
    public PlaneServices() {
    }
    public void ReplaceSeat(){
            System.out.println("Do you want to change your seat ?");
        String st = in.next();
        if(st.equals("Yes")){
        System.out.println("in which class do you want to change your seat ? ");
        int num = in.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("your seat will be in range 'A' from 1 to 4 for example 'A1' ");
                        System.out.println("Note that seat number 'A1'is unavailable ");
                        displaySeatsOfChange();
                        st = in.next();
                        System.out.println("Your seat has been changed");
                        break;
                    case 2:
                        System.out.println("your seat will be in range 'B' from 1 to 6 for example 'B1'");
                        System.out.println("Note that seat number 'B4' , 'B5' is unavailable ");
                        displaySeatsOfChange();
                        st = in.next();
                        System.out.println("Your seat has been changed");
                        break;
                    case 3:
                        System.out.println("your seat will be in range 'H' from 1 to 10 for example 'H1'");
                        System.out.println("Note that seat number 'H2' , 'H5' , 'H6' , 'H10' is unavailable ");
                        displaySeatsOfChange();
                        st = in.next();
                        System.out.println("Your seat has been changed");
                        break;
                    default:
                        break;
                }
                        }
        else{
                System.out.println("Your seat has not been changed ");
     
    }
}
    public boolean isParyArea() {
        return paryArea;
    }

    public void setParyArea(boolean paryArea) {
        this.paryArea = paryArea;
    }
    public String getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(String noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public ArrayList<String> getMenuEatOfEconomic() {
        return menuEatOfEconomic;
    }

    public void setMenuEatOfEconomic(ArrayList<String> menuEatOfEconomic) {
        this.menuEatOfEconomic = menuEatOfEconomic;
    }

    public ArrayList<String> getMenuEatOfBusiness() {
        return menuEatOfBusiness;
    }

    public void setMenuEatOfBusiness(ArrayList<String> menuEatOfBusiness) {
        this.menuEatOfBusiness = menuEatOfBusiness;
    }

    public ArrayList<String> getChangeSeats() {
        return changeSeats;
    }
    public void setChangeSeats(ArrayList<String> changeSeats) {
        this.changeSeats = changeSeats;
    }
//ميثود لتبديل المقاعد
public void displaySeatsOfChange(){
    if (changeSeats.size()==0){
        System.out.println("Please wait for the seats to change");
    }
    else {
        for (int i=0;i<changeSeats.size();i++){
            System.out.println((i+1)+"-seat: "+changeSeats.get(i));
        }   
            }
} 
// ميثود لادخال رقم المقعد الذى يريد التبديل
    /**
     *
     * @param numberOfSeat
     */
public void setSeat(String numberOfSeat){
    changeSeats.add(numberOfSeat);
}

@Override
   public void desplay(){
       System.out.println("Enter the type of seat: *Remeber: *\n 1-firstClass\n 2-Business class \n 3-Econamy class");
       int c = in.nextInt();
       if(c==3){
        menuEatOfEconomic.add("chesse");
        menuEatOfEconomic.add("Halloumi");
        menuEatOfEconomic.add("carrots juice");
        menuEatOfEconomic.add("Burger chicken");
        menuEatOfEconomic.add("rice");
        menuEatOfEconomic.add("water");
        menuEatOfEconomic.add("Shawarma");
        menuEatOfEconomic.add("kapap");
        menuEatOfEconomic.add("Apple juice");
           for (int i = 0; i <menuEatOfEconomic.size(); i++) {
               System.out.println(menuEatOfEconomic.get(i));
           }
       }
       else if(c==2){
        menuEatOfBusiness.add("Mushroom soup");
        menuEatOfBusiness.add("Cheese slices with lettuce");
        menuEatOfBusiness.add("Coffee cold");
        menuEatOfBusiness.add("tuna");
        menuEatOfBusiness.add("Meat");
        menuEatOfBusiness.add("guava juice");
        menuEatOfBusiness.add("pasta");
        menuEatOfBusiness.add("Caesar salad");
        menuEatOfBusiness.add("Strawberry juice");
        menuEatOfBusiness.add("water");
         for (int i = 0; i <menuEatOfBusiness.size(); i++) {
            System.out.println(menuEatOfBusiness.get(i));
           }
   }
       else if(c==1){
        menuEatOfFirstclass.add("chesse");
        menuEatOfFirstclass.add("Halloumi");
        menuEatOfFirstclass.add("carrots juice");
        menuEatOfFirstclass.add("Burger chicken");
        menuEatOfFirstclass.add("rice");
        menuEatOfFirstclass.add("water");
        menuEatOfFirstclass.add("Shawarma");
        menuEatOfFirstclass.add("kapap");
        menuEatOfFirstclass.add("Apple juice");
        menuEatOfFirstclass.add("Mushroom soup");
        menuEatOfFirstclass.add("Cheese slices with lettuce");
        menuEatOfFirstclass.add("Coffee cold");
        menuEatOfFirstclass.add("tuna");
        menuEatOfFirstclass.add("Meat");
        menuEatOfFirstclass.add("guava juice");
        menuEatOfFirstclass.add("pasta");
        menuEatOfFirstclass.add("Caesar salad");
        menuEatOfFirstclass.add("Strawberry juice");
        menuEatOfFirstclass.add("water");
            for (int i = 0; i <menuEatOfFirstclass.size(); i++) {
            System.out.println(menuEatOfFirstclass.get(i));
           }
       }
       else{
           System.out.println("Woring choice!!");
       }
       System.out.println("Enter your order you can choose a dish outside of the menu: \n The first dish: ");
       String d1 = in.next();
       System.out.println("The second dish: ");
       String d2 = in.next();
       System.out.println("The third dish: ");
       String d3 = in.nextLine();
       ArrayList<String> dishs = new ArrayList();
       dishs.add(d1);
       dishs.add(d2);
       dishs.add(d3);
       for (int i = 0; i <dishs.size(); i++) {
       System.out.println("\n Your Order is: "+dishs.get(i));
       }
}
    @Override
    public String toString() {
        return "PlaneServices{" + "noOfSeats=" + noOfSeats + ", paryArea=" + paryArea + '}';
    }    
}
