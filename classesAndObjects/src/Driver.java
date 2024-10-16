public class Driver {

    static int minAgeOfDriving =18;

    String name;

    int age;
    String dateOfLicense;

    public boolean isAllowedDriving(){
    // static instances can be accessed inside non-static method also.

        return this.age>=minAgeOfDriving;
    }

    public static void main(String[] args) {

        // declaring object
        Car myCar = new Car("white");

        Car thar = new Car();


        myCar.addFuel(6);
        myCar.drive();
        System.out.println("Color of the car:"+myCar.color);
        myCar.drive();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());


        Driver driver = new Driver();

        driver.dateOfLicense="1/Jan/2024";

        // static instances can be accessed without object creation.
        System.out.println(minAgeOfDriving);

        //  non-static instances can not be accessed inside static methods.

    }
}
