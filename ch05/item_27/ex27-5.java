public interface UnaryFunction<T> {
    T apply(T arg);
}



// 제네릭 싱글턴 팩터리 패턴
private static UnaryFunction<Object> IDENTITY_FUNCTION =
    new UnaryFunction<Object>() {
	public Object apply(Object arg) { return arg; }
    };

// IDENTITY_FUNCTION은 무상태 객체고 형인자는 비한정 인자이므로(unbounded)
// 모든 자료형이 같은 객체를 공유해도 안전하다.
@SuppressWarnings("unchecked")
public static <T> UnaryFunction<T> identityFunction() {
    return (UnaryFunction<T>) IDENTITY_FUNCTION;
}



// 제네릭 싱글턴 사용 예제
public static void main(String[] args) {
    String[] strings = { "jute", "hemp", "nylon" };
    UnaryFunction<String> sameString = identityFunction();
    for (String s : strings)
	System.out.println(sameString.apply(s));

    Number[] numbers = { 1, 2.0, 3L };
    UnaryFunction<Number> sameNumber = identityFunction();
    for (Number n : numbers)
	System.out.println(sameNumber.apply(n));
}
