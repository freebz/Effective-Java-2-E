// 기본 직렬화 형식을 그대로 써도 좋은 클래스 후보
public class Name implements Serializable {
    /**
     * 성(last name). null이 될 수 없다.
     * @serial
     */
    private final String lastName;

    /**
     * 이름(first name). null이 될 수 없다.
     * @serial
     */
    private final String firstName;

    /**
     * 중간 이름(middle name). 없을 때는 null이다.
     * @serial
     */
    private final String middleName;

    ... // 이하 생략
}
