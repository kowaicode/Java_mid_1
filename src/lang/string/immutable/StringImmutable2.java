package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        //str1은 hello로 못박힘..뭔짓거리해도 불변
        String str2 = str1.concat("java");
        //근데 str2이라는 새 객체를 만들고 거기에 str1(hello)를 불러와서 "java"를 결합시키는 concat을 쓴다면??
        System.out.println("str1 = " + str1); //hello
        System.out.println("str2 = " + str2); //hellojava
        
        //왜 String은 불변객체일까..
        //리터럴로 만든다면 String pool에 저장됨
        //근데 String이 가변객체라면 기존에 pool에서 같은 문자를 참조하는 변수의 모든 문자가 다 바뀌는것임
        //String str3 = "hello"
        //String str4 = "hello" 이런 상황에서 str3 문자 바꾸면 str4도 다 바뀌는 사이드이뻭또 오코루
        //그래서 불변으로 만들어진거임
    }
}
