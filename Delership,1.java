package delership;



public class Delership {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("TOYOTA" , "2020" , "red" , 120_000 );
        Employee employee = new Employee("Employee Name is : Ali ");
        Customer customer = new Customer("Mohammad", "Jeddah Alnassem " , 12_000);


        System.out.println("The vehicle price is \n :" + vehicle.getPrice() + "ريال");
        System.out.println("Is customer owning vehicle? \n :" + customer.doesOwn(vehicle));
        System.out.println(" >> purchasing car <<"+"\n");
        boolean x = true ;
        boolean y = false ;
        while (x) {
            customer.doesOwn(vehicle);
            customer.BuyCar(vehicle , employee , true);
            if(y){
                employee.BankAccount(customer, 0);
             }
            
            
            // لم يمتلكها لعدم وجود المبلغ الكافي ويجب احضار المزيد من المال
            System.out.println("Customer Name : "+customer.getName()+"\n"+"Customer address : "+customer.getAdderss()+"\n"+"Customer Cash : "+ customer.getCashOnHand()+"ريال");
            break;
        }
        System.out.println("Is customer owning vehicle? \n:" + customer.doesOwn(vehicle));
       
        // بعد احضار المال الان يمتلك السيارة الحمراء
        
        
            //only to know override & parameters هنا فقط لمعرفة الاوفر رايد وتمييز المدخلات     //
                        //        customer.toString();
                        // System.out.println(customer.toString());
                        //
                        //   vehicle.toString();
                        //       System.out.println(vehicle.toString());
                        //employee.toString();
                        // System.out.println("he E"+employee.toString());
    }
    
    
    

}
