public class Stack<E> {
    public Stack();
    public void push(E e);
    public E pop();
    public boolean isEmpty();
}



// 와일드카드 자료형을 사용하지 않는 pushAll 메서드 - 문제가 있다
public void pushAll(Iterable<E> src) {
    for (E e : src)
	push(e);
}



Stack<Number> numberStack = new Stack<Number>();
Iterable<Integer> integers = ...;
numberStack.pushAll(integers);



// E 객체 생산자 역할을 하는 인자에 대한 와일드카드 자료형
public void pushAll(Iterable<? extends E> src) {
    for (E e : src)
	push(e);
}
