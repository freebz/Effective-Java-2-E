public class Person {
    private final Date birthDate;

    // 다른 필드와 메서드, 생성자는 생략

    // 이렇게 하면 안 된다!
    public boolean isBabyBoomer() {
	// 생성 비용이 높은 객체를 쓸데없이 생성한다
	Calendar gmtCal =
	    Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
	Date boomStart = gmtCal.getTime();
	gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
	Date boomEnd = gmtCal.getTime();
	return birthDate.compareTo(boomStart) >= 0 &&
	    birthDate.compareTo(boomEnd) < 0;
    }
}
