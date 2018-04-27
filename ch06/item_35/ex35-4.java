// 인자를 취하는 어노테이션 자료형
import java.lang.annotation.*;

/**
 * 이 어노테이션이 붙은 메서드는 테스트 메서드이며,
 * 테스트에 성공하려면 지정된 예외를 발생시켜야 한다.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Exception> value();
}
