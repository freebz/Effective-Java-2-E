// 수정된 생성자 - 인자를 방어적으로 복사함
public Period(Date start, Date end) {
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());

    if (this.start.compareTo(this.end) > 0)
	throw new IllegalArgumentException(
	    this.start + " after " + this.end);
}
