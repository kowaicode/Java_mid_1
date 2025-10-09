package nested;

public class ShadowingMain {
    // 아래 3개의 value 변수는 변수명은 같지만 서로 다른 변수이다.
    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            // 가장 가까운 변수를 우선 사용
            System.out.println("value = " + value);
            // this는 Inner 객체를 가리킴
            System.out.println("this.value = " + this.value);
            // 바깥 클래스의 객체를 지정하려면 클래스명.this
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);
            // 위와 같이 다른 변수들을 가려서 사용하는 것을
            // 변수 섀도잉(variable shadowing)이라 한다.
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
