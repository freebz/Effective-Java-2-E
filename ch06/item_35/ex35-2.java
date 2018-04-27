// 표식 어노테이션을 사용하는 프로그램
public class Sample {
    @Test public static void m1() { } // 이 테스트는 성공해야 함
    public static void m2() { }
    @Test public static void m3() {   // 이 테스트는 실패해야 함
	throw new RuntimeException("Boom");
    }
    public static void m4() { }
    @Test public void m5() { }        // 잘못된 사용: static 메서드가 아님
    public static void m6() { }
    @Test public static void m7() {   // 이 테스트는 실패해야 함
	throw new RuntimeException("Crash");
    }
    public static void m8() { }
}
