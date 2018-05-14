// 동기화된 접근자를 사용한 객체 필드 초기화 지연 방법
private FieldType field;

synchronized FieldType getField() {
    if (field == null)
	field = computeFieldValue();
    return field;
}
