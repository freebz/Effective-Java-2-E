// Period 클래스의 직렬화 프락시
private static class SerializationProxy implements Serializable {
    private final Date start;
    private final Date end;

    SerializationProxy(Period p) {
	this.start = p.start;
	this.end = p.end;
    }

    private static final long serialVersionUID =
	234098243823485285L;  // 아무 수나 가능 (규칙 75)
}
