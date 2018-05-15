// 기본 직렬화 형식이 쓸만하지 않은 클래스 사례
public final class StringList implements Serializable {
    private int size = 0;
    private Entry head = null;

    private static class Entry implements Serializable {
	String data;
	Entry next;
	Entry previous;
    }

    ... // 이하 생략
}
