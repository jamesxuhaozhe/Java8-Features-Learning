package reflections;

@Deprecated
public class People implements LiveBeing {

    private int age;

    private String name;

    private String citizenShip;

    private String sex;

    private int phoneNumber;

    public static int publicField = 0;

    public int field = 1;

    public People(final int age, final String name, final String citizenShip, final String sex, final int phoneNumber) {
        this.age = age;
        this.name = name;
        this.citizenShip = citizenShip;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    private People(final int age, final String name, final String citizenShip) {
        this.age = age;
        this.name = name;
        this.citizenShip = citizenShip;
        this.sex = "male";
        this.phoneNumber = 1111;
    }

    public People(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenShip() {
        return citizenShip;
    }

    public void setCitizenShip(String citizenShip) {
        this.citizenShip = citizenShip;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private void setInterval() {
        //no-op
    }

    @Override
    public void eat() {
        //no-op
    }
}
