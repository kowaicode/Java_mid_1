package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(3, "Java"); //n번째 Index에서 다음의 문자열 추가
        System.out.println("insert = " + sb);

        sb.delete(4, 8); //Index 4~8까지 삭제
        System.out.println("delete = " + sb);

        sb.reverse(); //거꾸로
        System.out.println("reverse = " + sb);

        //StringBuilder(가변) -> String(불변)
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
