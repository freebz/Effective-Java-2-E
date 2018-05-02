// 컬렉션 순회를 위해 한동안 많이 썼던 숙어
for (Iterator i = c.iterator(); i.hasNext(); ) {
    doSomething((Element) i.next()); // (1.5 전에는 제네릭이 없었음)
}


// 배열 순회할 때 한동안 많이 사용한 숙어
for (int i = 0; i < a.length; i++) {
    doSomething(a[i]);
}


// 컬렉션이나 배열을 순회할 때는 이 숙어를 따르자
for (Element e : elements) {
    doSomething(e);
}
