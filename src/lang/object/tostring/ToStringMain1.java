package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());

        //object 직접 출력
        System.out.println(object);
        //System.out.println()은 내부에서 toString()을 호출하는 것이었음
    }
}
