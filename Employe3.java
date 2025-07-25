package delership;

public class Employee  {

    public String name;

    public Employee(String name) {
       
        this.name = name;
    }


    public boolean handleCustomer(Customer customer , boolean finance , Vehicle vehicle , Employee employee) {
             boolean TheyDeal = true ;
        if ( finance ) {
            // معرفة اذا كان يحتاح مزيد من المال او لاDetermine if more money is needed or not.

                    double AllAmount = vehicle.getPrice() - customer.getCashOnHand();
            //
                    boolean isApproved = getVisacredit(customer , AllAmount);
                                                      
        if ( isApproved )
        {
                TheyDeal = processTransaction(customer , vehicle);
            } 
        else
            {
                employee.BankAccount(customer, AllAmount);
        }
            } 
        //
        else
             {
            //كمية المبلغ اذا كان ناقص   The amount if it is missing.

         if ( customer.getCashOnHand() >= vehicle.getPrice() ) {
                TheyDeal = processTransaction(customer , vehicle);
             } 
        else
            {
            customer.bringCash(vehicle.getPrice());
// ما تم اضافته  هنا نقصت من فارق العربية لجلب المال الناقص من الفرق
        }
        }
        return TheyDeal;
        }  
public boolean BankAccount(Customer customer , double allamount ){
    boolean NotApproved = false;
        System.out.println("Your salary not cover this amount ");
        return NotApproved;
}

    public boolean getVisacredit(Customer customer , double allamount) {
        boolean isApproved = true;
        System.out.println("… runVisacredit() … loan approved");
        return isApproved;
    }


    public boolean processTransaction(Customer customer , Vehicle vehicle) {
        System.out.println("Customer purchased the vehicle for the price : " + vehicle.getPrice() + "ريال");
        customer.transact(vehicle);
        vehicle.setOwner(customer);
        return true;
    }


    @Override
    public String toString() {
        return "Employee{" + name + '}';
    }

}
