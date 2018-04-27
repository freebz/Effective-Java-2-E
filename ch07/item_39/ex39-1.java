// 변경 불가능성이 보장되지 않는 변경 불가능 클래스(!)
public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start 기간의 시작 시점
     * @param end 기간의 끝 시점. start보다 작은 값일 수 없다.
     * @throws IllegalArgumentException start가 end보다 뒤면 발생
     * @throws NullPointerException start나 end가 null이면 발생
     */
    public Period(Date start, Date end) {
	if (start.compareTo(end) > 0)
	    throw new IllegalArgumentException(
		start + "after " + end);
	this.start = start;
	this.end = end;
    }

    public Date start() {
	return start;
    }

    public Date end() {
	return end;
    }

    ... // 이하 생략
}
