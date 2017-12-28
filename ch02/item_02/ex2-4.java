// 자료형이 T인 객체에 대한 빌더
public interface Builder<T> {
    public T build();
}



Tree buildTree(Builder<? extends Node> nodeBuilder) { ... }
