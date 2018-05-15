// Period.SerializationProxy의 readResolve 메서드
private Object readResolve() {
    return new Period(start, end);  // public 생성자 이용
}
