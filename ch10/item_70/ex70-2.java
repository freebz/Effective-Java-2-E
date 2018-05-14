// Dos 공격을 피하기 위한 private 락 객체 숙어
private final Object lock = new Object();

public void foo() {
    synchronized(lock) {
	...
    }
}
