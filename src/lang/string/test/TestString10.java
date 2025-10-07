package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruit = fruits.split(",");
        for (String s : fruit) {
            System.out.println(s);
        }

        String joinedString = String.join("->", fruit[0], fruit[1], fruit[2]);
        System.out.println("joinedString = " + joinedString);
    }
}
