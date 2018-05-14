public interface SetObserver<E> {
    // 구독자 집합에 새 원소가 추가되었을 때 호출됨
    void added(ObservableSet<E> set, E element);
}
