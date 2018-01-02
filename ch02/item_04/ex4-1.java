// 객체를 만들 수 없는 유틸리티 클래스
public class UtilityClass {
    // 기본 생성자가 자동 생성되지 못하도록 하여 객체 생성 방지
    private UtilityClass() {
	throw new AssertionError();
    }
    ... // 나머지는 생략
}
