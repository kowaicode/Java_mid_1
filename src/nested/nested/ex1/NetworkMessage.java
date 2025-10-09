package nested.nested.ex1;

// 네트워크 메시지를 표현하는 클래스
// Network 객체 안에서만 사용되는 클래스
public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
