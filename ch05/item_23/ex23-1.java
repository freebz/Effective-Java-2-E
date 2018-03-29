// 무인자 컬렉션 자료형. 앞으로는 이렇게 하면 안 된다.
/**
 * 내 우표 컬렉션. Stamp 객체만 보관한다.
 */
private final Collection stamps = ...;



// 실수로 Coin 객체를 넣었다.
stamps.add(new Coin( ... ));



// 무인자 반복자 자료형. 앞으로는 이렇게 코딩하면 안 된다.
for (Iterator i = stamps.iterator(); i.hasNext(); ) {
    Stamp s = (Stamp) i.next(); // ClassCastException 예외 발생
    ... // 우표 객체로 뭔가 작업을 한다
}
