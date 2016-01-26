package car;

/**
 * Created by haozhexu on 1/26/16.
 */
public class Car {
    private String make;
    private String country;
    private String model;
    private String color;
    private String type;
    private int vin;
    private int year;
    private boolean isBrandNew;
    private boolean isForeign;

    public Car(String make, String country, String model,
               String color, String type, int vin, int year, boolean isBrandNew, boolean isForeign) {
        this.make = make;
        this.country = country;
        this.model = model;
        this.color = color;
        this.type = type;
        this.vin = vin;
        this.year = year;
        this.isBrandNew = isBrandNew;
        this.isForeign = isForeign;
    }

    public String getMake() {
        return make;
    }

    public String getCountry() {
        return country;
    }

    public int getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public boolean IsBrandNew() {
        return isBrandNew;
    }

    public boolean isForeign() {
        return isForeign;
    }

    @Override
    public String toString() {
        return make + " " + Integer.toString(vin) + " " + country;
    }
}
