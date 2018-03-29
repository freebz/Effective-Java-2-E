// 골격 구현 위에서 만들어진 완전한 List 구현
static List<Integer> intArrayAsList(final int[] a) {
    if (a == null)
	throw new NullPointerException();

    return new AbstractList<Integer>() {
	public Integer get(int i) {
	    return a[i];    // 자동 객체화 (규칙 5)
	}

	@Override public Integer set(int i, Integer val) {
	    int oldVal = a[i];
	    a[i] = val;    // 자동 비객체화
	    return oldVal; // 자동 객체화
	}

	public int size() {
	    return a.length;
	}
    };
}
