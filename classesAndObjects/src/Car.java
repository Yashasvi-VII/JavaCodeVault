import java.awt.print.Pageable;

public class Car {

    //instance properties or instance variables
static int noOfCarsSold;

    int noOfWheels;

    String color;

    float maxSpeed;

    int currentFuelInLiters;

    int noOfSeats;

    // static block
    static{
        noOfCarsSold=0;
    }

    // initialization block
    // this is called when object is instantiated
    {
noOfCarsSold++;
    }

    //constructor
    Car(String color){
        // default values
        noOfSeats=7;
        noOfWheels=4;
        this.color=color;
        maxSpeed=210;
        currentFuelInLiters=10;
    }

    // constructor chaining
    Car(){
      // this will give error  currentFuelInLiters=10;

        this("Black");
        currentFuelInLiters=20;
    }

    // instance methods

    public Car start(){

        // this can be used to return current class instance from method.
        return this;
    }

    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel");
        } else if(currentFuelInLiters>5) {
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
        else{
            System.out.println("Car is in reserve mode please refill the tank.");
        currentFuelInLiters--;
        }
    }
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters+=currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){return currentFuelInLiters;}


}
