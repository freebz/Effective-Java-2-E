// 비한정적 와일드카드 자료형 - 형 안전성과 유연성 만족
static int numElementsInCommon(Set<?> s1, Set<?> s2) {
    int result = 0;
    for (Object o1 : s1)
	if (s2.contains(o1))
	    result++;
    return result;
}
