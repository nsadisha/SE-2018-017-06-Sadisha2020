package classes;

public abstract class Vehicle {
    private String number;
    private String model;
    private String year;
    private String condition;

    //    setters
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    //    getters
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getCondition() {
        return condition;
    }
}
