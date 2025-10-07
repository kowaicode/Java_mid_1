package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    //고객번호(id)가 같으면 논리적으로 같은 객체로 정의할 것임
    private final String id;

    //생성자 생성
    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    //Object로부터 equals 오버라이딩!
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        //obj는 Object타입(부모타입)이기에 UserV2타입으로 다운캐스팅시켜줌
        //그리고 현재 자기자신의 타입의 인스턴스에다가
        //Object타입으로 넘어온 매개변수를 UserV2타입으로 다운캐스팅 시켜준 거를
        return id.equals(user.id);
        //비교하여 그 값을 return시켜준다
    }
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        UserV2 userV2 = (UserV2) obj;
        return Objects.equals(id, userV2.id);
    }

}
