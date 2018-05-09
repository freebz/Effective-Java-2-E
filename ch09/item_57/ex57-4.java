// 물론 이렇게 하면 곤란
try {
    Iterator<Foo> i = collection.iterator();
    while(true) {
	Foo foo = i.next();
	...
    }
} catch (NoSuchElementException e) {
}
