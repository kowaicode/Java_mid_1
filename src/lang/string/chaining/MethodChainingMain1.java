package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        adder.add(1);
        adder.add(2);
        adder.add(3);
        //add 메서드로 값 누적
        
        int result = adder.getValue();
        //getter로 값 불러옴
        System.out.println("result = " + result);
    }
}
