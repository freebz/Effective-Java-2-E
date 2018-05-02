/**
 * 지정된 예외를 반드시 발생시켜야 하는 테스트 메서드임을 명시.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {

    /**
     * 어노테이션이 붙은 테스트 메서드가 테스트를 통과하기 위해
     * 반드시 발생시켜야 하는 예외. (이 Class 객체가 나타내는 자료형의
     * 하위 자료형이기만 하면 어떤 예외든 상관없다.)
     */
    Class<? extends Throwable> value();
}
