// 문자열을 권한으로 사용하는, 잘못된 예제
public class ThreadLocal {
    private ThreadLocal() { }  // 객체를 만들 수 없다

    // 주어진 이름이 가리키는 스레드 지역 변수와 값 설정.
    public static void set(String key, Object value);

    // 주어진 이름이 가리키는 스레드 지역 변수의 값 반환.
    public static Object get(String key);
}
