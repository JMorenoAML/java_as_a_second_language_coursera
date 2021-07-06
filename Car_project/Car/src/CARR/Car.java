package CARR;

public class Car {
    private String make;
    private String model;
    private int year;

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
    public static void main(String[] args) {
        //TO-DO Auto-generated method sub
        System.out.println("This is a Car Java App");
    }
}
