// 하나 이상의 인자를 받아야 하는 varargs 메서드를 잘못 구현한 사례
static int min(int... args) {
    if (args.length == 0)
	throw new IllegalArgumentException("Too few arguments");
    int min = args[0];
    for (int i = 1; i < args.length; i++)
	if (args[i] < min)
	    min = args[i];
    return min;
}
