// varargs의 간단한 사용 예
static int sum(int... args) {
    int sum = 0;
    for (int arg : args)
	sum += arg;
    return sum;
}
