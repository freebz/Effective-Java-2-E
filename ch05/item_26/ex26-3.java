// 제네릭을 사용해 작성한 최초 Stack 클래스 - 컴파일되지 않는다!
public class Stack<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
	elements = new E[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
	ensureCapacity();
	elements[size++] = e;
    }

    public E pop() {
	if (size == 0)
	    throw new EmptyStackException();
	E result = elements[--size];
	elements[size] = null; // 만기 참조 제거
	return result;
    }

    public boolean isEmpty() {
	return size == 0;
    }

    private void ensureCapacity() {
	if (elements.length == size)
	    elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}



// 무점검 경고를 적절히 억제한 사례
public E pop() {
    if (size == 0)
	throw new EmptyStackException();

    // 자료형이 E인 원소만 push하므로, 아래의 형변환은 안전하다.
    @SuppressWarnings("unchecked") E result =
	(E) elements[--size];

    elements[size] = null;  // 만기 참조 제거
    return result;
}
