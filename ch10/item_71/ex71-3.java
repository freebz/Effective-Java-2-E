// 정적 필드에 대한 초기화 지연 담당 클래스 숙어
private static class FieldHolder {
    static final FieldType field = computeFieldValue();
}
static FieldType getField() { return FieldHolder.field; }
