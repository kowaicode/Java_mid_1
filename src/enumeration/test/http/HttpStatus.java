package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    private HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    // 코드로 HttpStatus 찾기
    public static HttpStatus findByCode(int code) {
        for (HttpStatus status : values()) {
            if (status.getCode() == code) {
                return status; // 코드에 해당하는 상태 반환
            }
        }
        return null; // 코드에 해당하는 상태가 없으면 null 반환
    }

    public boolean isSuccess() {
        return 200 <= code && code <= 299;
        // 200~299: 성공 상태 코드
    }
}
