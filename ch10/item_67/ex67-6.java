// 불가해 메서드를 호출하는 코드를 동기화 영역 밖으로 옮겼다 (open call)
private void notifyElementAdded(E element) {
    List<SetObserver<E>> snapshot = null;
    synchronized(observers) {
	snapshot = new ArrayList<SetObserver<E>>(observers);
    }
    for (SetObserver<E> observer : snapshot)
	observer.added(this, element);
}
