// 실행 가능 전략들을 외부에 공개하는 클래스
class Host {
    private static class StrLenCmp
	    implments Comparator<String>, Serializable {
	public int compare(String s1, String s2) {
	    return s1.length() - s2.length();
	}
    }

    // 이 비교자는 직렬화가 가능
    public static final Comparator<String>
	STRING_LENGTH_COMPARATOR = new StrLenCmp();

    ... // 나머지 생략
}
