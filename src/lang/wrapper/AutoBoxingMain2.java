package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        //기본형(Primitive) -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토 박싱(Auto-Boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //오토 언박싱(Auto-Unboxing)

        //Java에서 valueOf(), ~value() 등의 코드를 알아서 지원해서 그냥 변수명만 써도 알아서 박싱,언박싱됨
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
