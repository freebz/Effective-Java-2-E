// instanceof 연산자에는 무인자 자료형을 써도 OK
if (o instanceof Set) {		// 무인자 자료형
    Set<?> m = (Set<?>) o;	// 와일드카드 자료형
    ...
}
