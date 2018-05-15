// 개체 통제(instance control)를 위해 readResolve를 활용한 사례
// 이보다는 더 잘 할 수 있다!
private Object readResolve() {
    // 유일한 Elvis 객체를 반환하고, Elvis를 가장한 새 객체는 바로
    // 쓰레기 수집기가 처리하도록 한다.
    return INSTANCE;
}
