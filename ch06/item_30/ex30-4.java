// 자기 값에 따라 분기하는 Enum 자료형 - 의문스러운 구현법
public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    // 'this'상수가 나타내는 산술 연산 실행
    double apply(double x, double y) {
	switch(this) {
	case PLUS:   return x + y;
	case MINUS:  return x - y;
	case TIMES:  return x * y;
	case DIVIDE: return x / y;
	}
	throw new AssertionError("Unknown op: " + this);
    }
}
