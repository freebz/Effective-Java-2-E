// 표식 어노테이션 자료형(marker annotation type) 선언
import java.lang.annotation.*;

/**
 * 어노테이션이 붙은 메서드가 테스트 메서드임을 표시.
 * 무인자(parameterless) 정적 메서드에만 사용 가능.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementBype.METHOD)
public @interface Test {
}
