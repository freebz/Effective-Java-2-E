// 하나 이상의 인자를 받는 varargs 메서드를 제대로 구현한 사례
static int min(int firstArg, int... remainingArgs) {
    int min = firstArg;
    for (int arg : remainingArgs)
	if (arg < min)
	    min = arg;
    return min;
}
