// 형인자 컬렉션 자료형 - 형 안전성(typesafe) 확보
private final Collection<Stamp> stamps = ...;



// 형인자 컬렉션 자료형에 대한 for-each 문 - 형 안전성 보장
for (Stamp s : stamps) { // 형변환 불필요
    ... // 우표 객체 s로 필요한 작업 수행
}



// 형인자 반복자 자료형을 이용한 for 문 - 형 안전성 보장
for (Iterator<Stamp> i = stamps.iterator(); i.hasNext(); ) {
    Stamp s = i.next(); // 형변환 불필요
    ... // 우표 객체 s로 필요한 작업 수행
}
