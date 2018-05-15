// 기본 직렬화 형식을 이용하는 writeObject. 동기화된 클래스 용
private synchronized void writeObject(ObjectOutputStream s)
        throws IOException {
    s.defaultWriteObject();
}
