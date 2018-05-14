// 괜히 후면 스레드를 이용하는 구독자
set.addObserver(new SetObserver<Integer>() {
    public void added(final ObservableSet<Integer> s, Integer e) {
	System.out.println(e);
	if (e == 23) {
	    ExecutorService executor =
		Executors.newSingleThreadExecutor();
	    final SetObserver<Integer> observer = this;
	    try {
		executor.submit(new Runnable() {
		    public void run() {
			s.removeObserver(observer);
		    }
		}).get();
	    } catch (ExecutionException ex) {
		throw new AssertionError(ex.getCause());
	    } catch (InterruptedException ex) {
		throw new AssertionError(ex);
	    } finally {
		executor.shutdown();
	    }
	}
    }
});
