// 컴파일 불가 - 메서드 바디에도 와일드카드 필요!
public static <T extends Comparable<? super T>> T max(
        List<? extends T> list) {
    Iterator<T> i = list.iterator();
    T result = i.next();
    while (i.hasNext()) {
	T t = i.next();
	if (t.compareTo(result) > 0)
	    result = t;
    }
    return result;
}



Max.java:7: incompatible types
found    : Iterator<capture#591 of ? extends T>
required: Iterator<T>
        Iterator<T> i = list.iterator();
                                     ^


    Iterator<? extends T> i = list.iterator();
