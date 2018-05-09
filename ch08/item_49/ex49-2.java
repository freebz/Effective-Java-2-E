// 잘못된 반복자 - 어떤 문제가 있는가?
Comparator<Integer> naturalOrder = new Comparator<Integer>() {
    public int compare(Integer first, Integer second) {
	int f = first; // Auto-unboxing
	int s = second; // Auto-unboxing
	return f < s ? -1 : (f == s ? 0 : 1);  // No unboxing
    }
};
