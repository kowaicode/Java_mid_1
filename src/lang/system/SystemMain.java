package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재 시간(ms,밀리세컨)
        long currentTime = System.currentTimeMillis();
        System.out.println("currentTime = " + currentTime);

        //현재 시간(ns,나노세컨)
        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime = " + currentNanoTime);

        //환경 변수 읽기
        System.out.println("getenv = " + System.getenv());

        //시스템 속성 읽기
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열 고속 복사
        char[] originalArr = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArr = new char[5];
        System.arraycopy(originalArr, 0, copiedArr, 0, originalArr.length);
        System.out.println("copiedArr = " + copiedArr);
        System.out.println("Arrays.toString() = " + Arrays.toString(copiedArr));
    }
}
