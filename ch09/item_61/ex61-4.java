// 예외 연결 지원 생성자를 갖춘 예외
class HigherLevelException extends Exception {
    HigherLevelExcception(Throwable cause) {
	super(cause);
    }
}
