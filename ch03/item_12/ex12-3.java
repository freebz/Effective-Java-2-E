public final class CaseInsensitiveString
        implements Comparable<CaseInsensitiveString> {
    public int compareTo(CaseInsensitiveString cis) {
	return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
    ... // 이하 생략
}
