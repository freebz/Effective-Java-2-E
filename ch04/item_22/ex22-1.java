// 비-정적 멤버 클래스의 전형적 용례
public class MySet<E> extends AbstractSet<E> {

    ... // 샹략

    public Iterator<E> iterator() {
	return new new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
	...
    }
}
