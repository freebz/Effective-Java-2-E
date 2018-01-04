// 종료 보호자 숙어(Finalizer Guardian idiom)
public class Foo {
    // 이 객체는 바깥 객체(Foo 객체)를 종료시키는 역할만 한다.
    private final Object finalizerGuardian = new Object() {
	@Override protected void finalize() throws Throwable {
	    ... // 바깥 Foo 객체를 종료시킴
	}
    };
    ... // 이하 생략
}
