public interface Iterable<E> {
    // 이 Iterable 안에 있는 원소들에 대한 반복자 반환
    Iterator<E> iterator();
}
