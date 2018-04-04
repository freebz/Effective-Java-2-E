// enum 자료형에 대한 fromString 메서드 구현
private static final Map<String, Operation> stringToEnum
    = new HashMap<String, Operation>();
static { // 상수 이름을 실제 상수로 대응시키는 맵 초기화
    for (Operation op : values())
	stringToEnum.put(op.toString(), op);
}
// 문자열이 주어지면 그에 대한 Operation 상수 반환. 잘못된 문자열이면 null 반환
public static Operation fromString(String symbol) {
    return stringToEnum.get(symbol);
}
