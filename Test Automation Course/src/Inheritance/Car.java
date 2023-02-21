package Inheritance;

public class Car extends Vehicle {

    String carBrand = "Mercedes";

    @Override
    public void showCarDetails() {
            super.showCarDetails();
            System.out.println("The vehicle is a: "+ carBrand);
    }

}
