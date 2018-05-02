for (Iterator<Element> i = c.iterator(); i.hasNext(); } {
    soSomething(i.next());
}

    ...

// 심볼 i를 찾을 수 없다면서 컴파일 시점에 오류 발생
for (Iterator<Element> i2 = c2.iterator(); i.hasNext(); } {
    doSomething(i2.next());
}
