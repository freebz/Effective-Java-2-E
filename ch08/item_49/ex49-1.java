// 잘못된 반복자 - 어떤 문제가 있는가?
Comparator<Integer> naturalOrder = new Comparator<Integer>() {
    public int compare(Integer first, Integer second) {
	return first < second ? -1 : (first == second ? 0 : 1);
    }
};
