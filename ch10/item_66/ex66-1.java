// 잘못된 코드 - 이 프로그램은 얼마나 오랫동안 실행될까?
public class StopThread {
    private static boolean stopRequested;

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
