package reflections;

@MyAnnotationType(name = "house", value = "housevalue")
public class House {
    private String location;

    private String country;

    @MyAnnotationField(name = "owner", value = "james")
    private String owner;

    private String street;

    private int streetNo;

    public House(final String location, final String country, final String owner, final String street, final int streetNo) {
        this.location = location;
        this.country = country;
        this.owner = owner;
        this.street = street;
        this.streetNo = streetNo;
    }

    @MyAnnotationMethod(name = "getlocation", value = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }
}
