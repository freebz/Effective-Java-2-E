// 유효성을 검사하는 readObject 메서드
private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
    s.defaultReadObject();

    // 불변식이 만족되는지 검사
    if (start.compareTo(end) > 0)
	throw new InvalidObjectException(start +" after "+ end);
}
