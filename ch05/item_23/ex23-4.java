// 원소 자료형을 모르므로 무인자 자료형 사용 - 이러면 곤란
static int numElementsInCommon(Set s1, Set s2) {
    int result = 0;
    for (Object o1 : s1)
	if (s2.contains(o1))
	    result++;
    return result;
}
