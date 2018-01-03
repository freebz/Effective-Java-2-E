public class Person {
    private final Date birthDate;
    // 다른 필드와 메서드, 생성자는 생략

    /**
     * 베이비 붐 시대의 시작과 끝
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
	Calendar gmtCal =
	    Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
	BOOM_START = gmtCal.getTime();
	gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
	BOOM_END  = gmtCal.getTime();
    }
    
    public boolean isBabyBoomer() {
	return birthDate.compareTo(boomStart) >= 0 &&
	    birthDate.compareTo(boomEnd) < 0;
    }
}
