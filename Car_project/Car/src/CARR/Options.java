package CARR;

public class Options {
    private String radio;
    private String selfDriving;
    private String fuel;

    public Options (String radio, String selfDriving, String fuel){

        this.radio = radio;
        this.selfDriving = selfDriving;
        this.fuel = fuel;
    } // end of the constructor here

    public String setRadioOption(String radio) {

        this.radio = radio;      // "this" does exactly the same as "self" when defining Python classes behaviours
        return radio;
    }  // setting Radio option

    public String getRadioOption() {
        return radio;
    } // get Radio Option

    public String setDrivingOption(String selfDriving){

        this.selfDriving = selfDriving;
        return selfDriving;
    } // setting Selfdriving

    public String getDrivingOption(String selfDriving) {
        
        return selfDriving;
    } // getting Driving Option

    public String setFuelOption(String fuel) {

        this.fuel = fuel;
        return fuel;
    } // setting Fuel Option

    public String getFuelOption(String fuel){
        return fuel;
    } //getting fuel option
     //this function allows me now to format the output
     public String toString() { 
        return "Options: radio:" + radio + ", Driving Option: " + selfDriving + ", fuel type: " + fuel + "\n";
    } // end of formatter
    
}

// Now that we have the Options class, 
// we need to instantiate the objects in the application’s main function.
