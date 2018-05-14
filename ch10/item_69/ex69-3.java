// 작업의 병렬 수행 시간을 재는 간단한 프레임워크
public static long time(Executor executor, int concurrency,
			final Runnable action) throws InterruptedException {
    final CountDownLatch ready = new CountDownLatch(concurrency);
    final CountDownLatch start = new CountDownLatch(1);
    final CountDownLatch done = new CountDownLatch(concurrency);
    for (int i = 0; i < concurrency; i++) {
	executor.execute(new Runnable() {
	    public void run() {
		ready.countDown(); // 타이머에게 준비됨을 알림
		try {
		    start.await(); // 다른 작업 스레드가 준비될 때까지 대기
		    action.run();
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		} finally {
		    done.countDown(); // 타이머에게 끝났음을 알림
		}
	    }
	});
    }
    ready.await();         // 모든 작업 스레드가 준비될 때까지 대기
    long startNanos = System.nanoTime();
    start.countDown();     // 출발!
    down.await();          // 모든 작업 스레드가 끝날 때까지 대기
    return System.nanoTime() - startNanos;
}
