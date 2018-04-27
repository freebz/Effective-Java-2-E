// 배열을 인자로 받는 어노테이션 사용 예
@ExceptionTest({ IndexOutOfBoundsException.class,
	         NullPointerException.class })
public static void doublyBad() {
    List<String> list = new ArrayList<String>();

    // 자바 명세에는 아래와 같이 addAll을 호출하면
    // IndexOutOfBoundsException이나 NullPointerException이 발생한다고
    // 명시되어 있다.
    list.addAll(5, null);
}
