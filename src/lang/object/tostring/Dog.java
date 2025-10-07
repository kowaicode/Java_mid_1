package lang.object.tostring;

//오버라이딩 함
public class Dog {

    private final String dogName;
    private final int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "dogName = " + dogName + " / " + "age = " + dogAge;
    }
}
