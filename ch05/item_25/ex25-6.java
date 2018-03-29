// 리스트를 사용하는 제네릭 버전 reduce
static <E> E reduce(List<E> list, Function<E> f, E initVal) {
    List<E> snapshot;
    synchronized(list) {
	snapshot = new ArrayList<E>(list);
    }
    E result = initVal;
    for (E e : snapshot)
	result = f.apply(result, e);
    return result;
}
