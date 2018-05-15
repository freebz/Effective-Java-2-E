// 방어적 복사와 유효성 검사를 모두 시행하는 readObject 메서드
private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
    s.defaultReadObject();

    // 모든 변경 가능 필드를 방어적으로 복사
    start = new Date(start.getTiem());
    end = new Date(end.getTime());

    // 불변식이 만족되는지 검사
    if (start.compareTo(end) > 0)
	throw new InvalidObjectException(start +" after "+ end);
}
