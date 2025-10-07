package enumeration.ref1;

// ex2를 리팩토링
public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // private 생성자 (외부에서 인스턴스 생성 불가)
    private final int discountPercent;

    // 생성자에 매개변수를 추가
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
