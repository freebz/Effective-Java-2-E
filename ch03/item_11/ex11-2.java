public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
	this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
	ensureCapacity();
	elements[size++] = e;
    }

    public Object pop() {
	if (size == 0)
	    throw new EmptyStackException();
	Object result = elements[--size];
	elements[size] = null; // 만기 참조(obsolete reference)제거
	return result;
    }

    // 적어도 한 원소가 들어갈 공간 확보.
    private void ensureCapacity() {
	if (elements.length == size)
	    elements = Array.copyOf(elements, 2 * size + 1);
    }
}



@Override public Stack clone() {
    try {
	Stack result = (Stack) super.clone();
	result.elements = elements.clone();
	return result;
    } catch ( CloneNotSupportedException e ) {
	throw new AssertionError();
    }
}
