// 절절히 동기화된 스레드 종료 예제
public class StopThread {
    private static boolean stopRequested;
    private static synchronized void requestStop() {
	stopRequested = true;
    }
    private static synchronized boolean stopRequested() {
	return stopRequested;
    }

    public static void main(String[] args)
	     throws InterruptedException {
	Thread backgroundThread = new Thread(new Runnable() {
	    public void run() {
		int i = 0;
		while (!stopRequested())
		    i++;
	    }
	});
	backgroundThread.start();

	TimeUnit.SECONDS.sleep(1);
	requestStop();
    }
}
