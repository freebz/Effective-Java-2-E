// 사용자 정의 직렬화 형식을 이용하는 StringList
public final class StringList implements Serializable {
    private transient int size = 0;
    private transient Entry head = null;

    // 더 이상 Serializable일 필요가 없음!
    private static class Entry {
	String data;
	Entry next;
	Entry previous;
    }

    // 주어진 문자열을 리스트에 추가
    public final void add(String s) { ... }

    /**
     * this가 가리키지는 {@code StringList} 객체를 직렬화
     *
     * @serialData 리스트의 크기(리스트 내 문자열 개수)가 먼저 기록되고
     * ({@code int}), 그 다음에는 모든 문자열({@code String} 각각)이
     * 순서대로 기록된다.
     */
    private void writeObject(ObjectOutputStream s)
	    throws IOException {
	s.defaultWriteObject();
	s.writeInt(size);

	// 순서대로 모든 원소 기록
	for (Entry e = head; e != null; e = e.next)
	    s.writeObject(e.data);
    }

    private void readObject(ObjectInputStream s)
	    throws IOException, ClassNotFoundException {
	s.defaultReadObject();
	int numElements = s.readInt();

	// 모든 원소를 읽어 리스트에 저장
	for (int i = 0; i < numElements; i++)
	    add((String) s.readObject());
    }

    ... // 이하 생략
}
