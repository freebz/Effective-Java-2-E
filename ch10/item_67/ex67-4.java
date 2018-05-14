set.addObserver(new SetObserver<Integer>() {
    public void added(ObservableSet<Integer> s, Integer e) {
	System.out.prtinln(e);
	if (e == 23) s.removeObserver(this);
    }
});
