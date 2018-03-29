// 전략 인터페이스
public interface Comparator<T> {
    public int compare(T t1, T t2);
}



class StringLengthComparator implements Comparator<String> {
    ... // 클래스 내부는 앞서 살펴본 예제와 동일
}
