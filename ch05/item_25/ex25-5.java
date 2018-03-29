interface Function<T> {
    T apply(T arg1, T arg2);
}



// reduce의 제네릭 버전 - 컴파일되지 않는다!
static <E> reduce(List<E> list, Function<E> f, E initVal) {
    E[] snapshot = list.toArray();  // 리스트에 락을 건다
    E result = initVal;
    for (E e : snapshot)
	result = f.apply(result, e);
    return result;
}



E[] snapshot = (E[]) list.toArray();
