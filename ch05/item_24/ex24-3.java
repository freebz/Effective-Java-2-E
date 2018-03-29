// @SuppressWarning의 적용 범위를 줄이기 위해 지역 변수 사용
public <T> T[] toArray(T[] a) {
    if (a.length < size) {
	// 아래의 형변환은 배열의 자료형이 인자로 전달된 자료형인 T[]와
	// 같으므로 정확하다.
	@SuppressWarnings("unchecked") T[] result =
	    (T[]) Arrays.copyOf(elements, size, a.getClass());
	return result;
    }
    System.arraycopy(elements, 0, a, 0, size);
    if (a.length > size)
	a[size] = null;
    return a;
}
