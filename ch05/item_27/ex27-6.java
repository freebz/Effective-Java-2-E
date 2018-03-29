public interface Comparable<T> {
    int compareTo(T o);
}



// 재귀적 자료형 한정을 통해 상호 비교 가능성(mutual comparability) 표현
public static <T extends Comparable<T>> T max(List<T> list) {...}



// 리스트의 최대 값 반환 - 재귀적 자료형 한정 사용
public static <T extends Comparable<T>> T max(List<T> list) {
    Iterator<T> i = list.iterator();
    T result = i.next();
    while (i.hasNext()) {
	T t = i.next();
	if (t.compareTo(result) > 0)
	    result = t;
    }
    return result;
}
