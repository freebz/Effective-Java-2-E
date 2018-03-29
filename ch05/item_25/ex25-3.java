// 제네릭 없이 작성한 reduce 함수. 병행성(concurrency) 문제가 있다!
static Object reduce(List list, Function f, Object initVal) {
    synchronized(list) {
	Object result = initVal;
	for (Object o : list)
	    result = f.apply(result, o);
	return result;
    }
}

interface Function {
    Object apply(Object arg1, Object arg2);
}
