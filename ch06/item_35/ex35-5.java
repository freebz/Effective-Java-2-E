// 인자를 받는 어노테이션의 사용 예제
public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {   // 이 테스트는 성공해야 함
	int i = 0;
	i = i / i;
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m2() {   // 실패해야 함(엉뚱한 예외 발생)
	int[] a = new int[0];
	int i = a[1];
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m3() { } // 실패해야 함(예외가 발생하지 않음)
}
