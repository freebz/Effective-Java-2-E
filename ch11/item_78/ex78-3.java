// 직렬화 프락시 패턴 구현을 위한 readObject 메서드
private void readObject(ObjectInputStream stream)
        throws InvalidObjectException {
    throw new InvalidObjectException("Proxy required");
}
