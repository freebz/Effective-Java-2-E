// 직렬화 불가능 상태유지(stateful) 클래스의 직렬화 가능 하위 클래스
public class Foo extends AbstractFoo implements Serializable {
    private void readObject(ObjectInputStream s)
	    throws IOException, ClassNotFoundException {
	s.defaultReadObject();
	
	// 상위 클래스 상태를 수동으로 역직렬화 한 다음 초기화
	int x = s.readInt();
	int y = s.readInt();
	initialize(x, y);
    }

    private void writeObject(ObjectOutputStream s)
	throws IOException {
	s.defaultWriteObject();

	// 상위 클래스 상태를 수동으로 직렬화
	s.writeInt(getX());
	s.writeInt(getY());
    }

    // 생성자는 이 메커니즘과 상관없음
    public Foo(int x, int y) { super(x, y); }

    private static final long serialVersionUID = 1856835860954L;
}
