package CARR;

/*******************************************
 *   This app buils a car for an           *
 *   online order system                   *
 *******************************************/

public class Car {
    //these are my attributes
    private String make;
    private String model;
    private int year;

    //now here, these are the constructors to instantiate
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String setCarMake(String make) {
        this.make = make;
        return make;
    }
    public String getCarMake(){
        return make;
    }

    public String setCarModel(String model) {
        this.model = model;
        return model;
    }

    public String getCarModel(){
        return model;
    }

    public int setCarYear(int year) {
        this.year = year;
        return year;
    }

    public int getCarYear() {
        return year;
    }
    //this function allows me now to format the output
    public String toString() { 
        return "\nCar make:" + make + ", model: " + model + ", Car Year: " + year;
    } 
    public static void main(String[] args) {
        //TO-DO Auto-generated method sub
        Car car1 = new Car("Ford", "F150" , 2015);
        Car car2 = new Car("Chevy", "Corvette" , 2018); 
        Car car3 = new Car("Jeep", "Rubicon" , 2020);

        Options opt1 = new Options("AM/FM","None","FlexFuel");
        Options opt2 = new Options("None","standard","Gas");
        Options opt3 = new Options("satellite","self driving","DualFuel");

        System.out.println(car1.toString());
        System.out.println(opt1.toString());

        System.out.println(car2.toString());
        System.out.println(opt2.toString());

        System.out.println(car3.toString());
        System.out.println(opt3.toString());
    }
}
