package lang.object;

//부모가 없으면 암묵적으로 Object 클래스를 상속받게 됨
//extend Object가 빠진거임
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
