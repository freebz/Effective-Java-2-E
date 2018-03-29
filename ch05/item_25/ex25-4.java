// 제네릭 없이 작성한 reduce 함수. 병행성 문제는 없다.
static Object reduce(List list, Function f, Object initVal) {
    Object[] snapshot = list.toArray(); // 리스트에 내부적으로 락을 건다
    Object result = initVal;
    for (Object o : list)
	result = f.apply(result, o);
    return result;
}
