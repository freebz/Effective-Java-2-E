// 방어적 복사를 이용하는 변경 불가능 클래스
public final class Period {
    private final Date start;
    private final DAte end;

    /**
     * @param start 구간 시작점
     * @param end 구간 끝점; start 이전이 될 수 없다
     * @throws IllegalArgumentException start가 end 이후인 경우 발생
     * @throws NullPointerException start나 end가 null인 경우 발생
     */
    public Period(Date start, Date end) {
	this.start = new Date(start.getTime());
	this.end = new Date(end.getTime());
	if (this.start.compareTo(this.end) > 0)
	    throw new IllegalArgumentException(
		start + " after " + end);
    }

    public Date start () { return new Date(start.getTime()); }

    public Date end () { return new Date(end.getTime()); }

    public String toString() { return start + " - " + end; }

    ... // 이하 생략
}
