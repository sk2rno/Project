
package delership;
public class Vehicle {
// هذا الاتربيوتس حقت السيارة  Options we got
    private String make;
    private String model;
    private String color;
    private String plate;
    private double price;
    private Customer owner;

// كتابة البارامتر في الكونستركتر الاولWriting the parameter in the first constructor.

    public Vehicle(String make , String model , String color , double price) {
        this(make , model , color , "unknown" , price);
        // هذا حيكون الكونسترمكر بدون معرفة صاحب السيارةconstructor without knowing the owner


    }


    public Vehicle(String make , String model , String color , String plate , double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.price = price;
        // second Writing the parameter in the first constructor.

    }

// من هنا السترر والقيترر لتعريف البرايفت From here, the setter and getter are used to define the private variable.

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getMake() {
        return make;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public Customer getOwner() {
        return owner;
    }


    public void setOwner(Customer owner) {
        this.owner = owner;
    }


    public String getPlate() {
        return plate;
    }


    public void setPlate(String plate) {
        this.plate = plate;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

// هنا وضعت الاوفر رايد لاختصار الوقت بدون استدعاء كل اوبجكت لوحده  وهي تابعه لفيكل Here, I used the override to save time without calling each object individually, and it is part of the Vehicle class.
    @Override
    public String toString() {
        return "Vehicle{"
                + "make : " + make
                + ", model : " + model
                + ", color : " + color
                + ", plate : " + plate
                + ", price : " + price + "ريال" + '}';
    }

    

}
