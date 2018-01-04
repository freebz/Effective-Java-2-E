// try-finally 블록을 통해 종료 메서드 실행 보장
Foo foo = new Foo(...);
try {
    // foo로 해야 하는 작업 수행
    ...
} finally {
    foo.terminate();  // 명시적 종료 메서드 호출
}
