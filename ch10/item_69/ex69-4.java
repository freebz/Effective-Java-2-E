// wait 메서드를 사용하는 표준적 숙어
synchronized (obj) {
    while (<이 조건을 만족되지 않을 경우에 순환문 실행>)
	obj.wait();  // (락 해제. 깨어나면 다시 락 획득)

    ... // 조건이 만족되면 그에 맞는 작업 실행
}
