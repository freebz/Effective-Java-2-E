// 컬렉션을 순회할 때는 이 숙어대로 하는 것이 바람직
for (Element e : c) {
    doSomething(e);
}


// for-each 문이나 제네릭이 지원되지 않던 시절의 코드
for (Iterator i = c.iterator(); i.hasNext(); } {
    doSomething((Element) i.next());
}
