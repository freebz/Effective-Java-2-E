// 제네릭을 사용해 작성한 최초 Stack 클래스 - 컴파일되지 않는다!
public class Stack<E> {
    private E[] elements;
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



// elements 배열에는 push(E)를 통해 전달된 E 형의 객체만 저장된다.
// 이 정도면 형 안전성은 보장할 수 있지만, 배열의 실행시간 자료형은 E[]가
// 아니라 항상 Object[]이다!
@SuppressWarnings("unchecked")
public Stack() {
    elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
}
