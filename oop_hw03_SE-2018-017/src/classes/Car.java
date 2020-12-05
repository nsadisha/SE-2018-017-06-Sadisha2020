package classes;

public class Car extends Vehicle {
    private String brand;
    private double maxSpeed;
    private String colour;

    public Car(String brand, String model, String number, String year, double maxSpeed, String colour, String condition) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.colour = colour;

        super.setModel(model);
        super.setNumber(number);
        super.setYear(year);
        super.setCondition(condition);
    }

//    setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //    getters
    public String getBrand() {
        return brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getColour() {
        return colour;
    }
}
