// 변경 불가능 필드를 외부로 공개하는 public 클래스 - 정말 이래야 하는지는 의문
public final class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
	if (hour < 0 || hour >= HOURS_PER_DAY)
	    throw new IllegalArgumentException("Hour: " + hour);
	if (minute < 0 || minute >= MINUTES_PER_HOUR)
	    throw new IllegalArgumentException("Min: " + minute);
	this.hour = hour;
	this.minute = minute;
    }
    ... // 이하 생략
}
