// volatile 필드를 사용해 스레드를 종료시키는 예제
public class StopThread {
    private static volatile boolean stopRequested;

    public static void main(String[] args)
	     throws InterruptedException {
	Thread backgroundThread = new Thread(new Runnable() {
	    public void run() {
		int i = 0;
		while (!stopRequested)
		    i++;
	    }
	});
	backgroundThread.start();

	TimeUnit.SECONDS.sleep(1);
	stopRequested = true;
    }
}
