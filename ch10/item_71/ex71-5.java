// 단일 검사 숙어 - 필드가 여러 번 초기화 될 수도 있다!
private volatile FieldType field;

private FieldType getField() {
    FieldType result = field;
    if (result == null)
	field = result = computeFieldValue();
    return result;
}
