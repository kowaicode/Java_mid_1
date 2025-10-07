package enumeration.test.ex1;

// AuthGrade 열거형: 사용자 권한 등급을 나타내는 열거형
public enum AuthGrade {
    GUEST(1, "손놈"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    // 필드 선언(권한 레벨과 설명)
    private final int level;
    private final String description;

    // 생성자: 열거형 상수의 필드를 초기화
    AuthGrade(int level, String desc) {
        this.level = level;
        this.description = desc;
    }

    // Getter 메서드: 필드 값을 반환
    public int getLevel() {
        return level;
    }
    public String getDescription() {
        return description;
    }

}
