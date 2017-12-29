// 싱글턴 상태를 유지하기 위한 readResolve 구현
private Object readResolve() {
    // 동일한 Elvis 객체가 반환되도록 하는 동시에, 가짜 Elvis 객체는
    // 쓰레기 수집기(garbage collector)가 처리하도록 만든다.
    return INSTANCE;
}
