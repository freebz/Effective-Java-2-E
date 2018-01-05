// 대칭성 위반!
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
	if (s == null)
	    throw new NullPointerException();
	this.s = s;
    }

    // 대칭성 위반!
    @Override public boolean equals(Object o) {
	return s.equalsIgnoreCase(
	    ((CaseInsensitiveString) o).s);
	if (o instanceof String) // 한 방향으로만 정상 동작!
	    return s.equalsIgnoreCase((String) o);
	return false;
    }
    ... // 이하 생략
}



@override public Boolean equals(Object o) {
    return o instanceof CaseInsensitiveString &&
	((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
}
