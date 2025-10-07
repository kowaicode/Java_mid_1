package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        //concat(); : 기존 문자열에 새로운 문자열을 합칠 수 있는 메서드. String에 내장됨
        System.out.println("str = " + str);
        //그러면 str = hellojava여야 되는디
        //str = hello로 뜸...왜?
        //String은 불변 객체...
        //str은 hello로 정해졌고 뭔짓을 해도 안바뀜
        //그래서 concat도 소용없음
        //해결방법: 객체를 또 만들어서 거기에 concat을 시전(StringImmutable2)
    }
}
