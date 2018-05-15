// 직렬화 프락시 패턴을 구현하기 위한 writeReplace 메서드
private Object writeReplace() {
    return new SerializationProxy(this);
}
