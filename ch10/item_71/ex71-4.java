// 이중 검사 패턴을 통해 객체 필드 초기화를 지연시키는 숙어
private volatile FieldType field;

FieldType getField() {
    FieldType result = field;
    if (result == null) {  // 첫 번째 검사 (락 없음)
	synchronized(this) {
	    result = field;
	    if (result == null)  // 두 번째 검사 (락)
		field = result = computeFieldValue();
	}
    }
    return result;
}
