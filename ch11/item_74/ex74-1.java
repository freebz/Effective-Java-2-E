// 상태유지(stateful) 계승 가능(extendable) 직렬화 가능(serializable)
// 클래스에 대한 readObjectNoData 메서드
private void readObjectNoData() throws InvalidObjectException {
    throw new InvalidObjectException("Stream data required");
}
