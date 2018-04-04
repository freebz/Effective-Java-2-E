// 와일드카드 자료형 없이 구현한 popAll 메서드 - 문제가 있다!
public void popAll(Collection<E> dst) {
    while (!isEmpty())
	dst.add(pop());
}



Stack<Number> numberStack = new Stack<Number>();
Collection<Object> objects = ...;
numberStack.popAll(objects);



// E의 소비자 구실을 하는 인자에 대한 와일드카드 자료형
public void popAll(Collection<? super E> dst) {
    while (!isEmpty())
	dst.add(pop());
}
