// EnumSet의 직렬화 프락시
private static class SerializationProxy <E extends Enum<E>>
        implements Serializable {
    // 이 enum 집합의 원소 자료형
    private final Class<E> elementType;

    // 이 enum 집합에 담긴 원소들
    private final Enum[] elements;

    SerializationProxy(EnumSet<E> set) {
	elementType = set.elementType;
	elements = set.toArray(EMPTY_ENUM_ARRAY);  // (규칙 43)
    }

    private Object readResolve() {
	EnumSet<E> result = EnumSet.noneOf(elementType);
	for (Enum e : elements)
	    result.add((E)e);
	return result;
    }

    private static final long serialVersionUID =
	362491234563181265L;
}
