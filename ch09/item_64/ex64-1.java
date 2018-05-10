public Object pop() {
    if (size == 0)
	throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null; // 만기(obsolete) 참조 제거
    return result;
}
