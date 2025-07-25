package delership;


import java.util.ArrayList;

public class Customer {

    private  String name;
    private  String address;
    private String phone;
    private  String email;
    private double cashOnHand;
    private ArrayList<Vehicle> vehicles;

    
    


    public Customer(String name , String address , double cashInHand) {
        this(name , address , "unknown" , cashInHand );
    }


    public Customer(String name , String address , String phone , double cashInHand) {
        this(name , address , phone , "unknown" , cashInHand);
    }


    public Customer(String name , String address , String phone , String email , double cashInHand) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cashOnHand = cashInHand;
        this.vehicles = new ArrayList<>();// كولكلين للسيارات الممولكه ويتم تخزينها في الايرايsave cars on ArrayList
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    
    
    public String getName() {
        return name;
    }
    public String getAdderss(){
        return address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }


    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


    public boolean doesOwn(Vehicle vehicle) {
        return this.vehicles.contains(vehicle);
    }

// من الفانكنش هنا باستدعيها لشراء من الموظف 
    public boolean BuyCar(Vehicle vehicle , Employee employee , boolean finance) {
              //               ما فعلته هان استدعيت فانكشن اسمها هاندل كوستمر من كلاس اومبلي   What I did here is call a function named handleCustomer from a class called Umble.

   
        boolean TheyDeal = employee.handleCustomer(this , finance , vehicle,employee);
        // هنا اذا تم الشراء او لا
                 if ( TheyDeal ) {
                        this.vehicles.add(vehicle);
                        
                       } 
                 else {
                    finance = false ;
                 }
                 
         
                        
        
                 
              return finance;       
    }

// If u want to bring more CASH من هنا اذا تريد زيادة كمية الفلوس من البيت 
    public void bringCash(double amount) {
        System.out.println("Bring some cash from home : " + amount + "ريال");
        this.cashOnHand += amount;
    }

//تنقص كمية الفلوس من قيمة السيارة To decres the amonut of money 
    public void transact(Vehicle vehicle ) {
        
        this.cashOnHand = vehicle.getPrice();
    }

//مع الكوستنر لطباعة جميع الببيانات المخزنه To print all INF we got  
    @Override
    public String toString() {
        return "Customer{"
                + "name : " + name
                + ", address : " + address
                + ", phone : " + phone
                + ", email : " + email
                + ", cashOnHand : " + cashOnHand
                + ", vehicles : " + vehicles + '}' ;
    }

}

