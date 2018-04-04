// swap 메서드를 선언하는 두 가지 방법
public static <E> void swap(List<E> list, int i, int j);
public static void swap(List<?> list, int i, int j);


public static void swap(List<?> list, int i, int j) {
    list.set(i, list.set(j, list.get(i)));
}


Swap.java:5: set(int,capture#282 of ?) in List<capture#282 of ?>
cannot be applied to (int,Object)
        list.set(i, list.set(j, list.get(i)));
                        ^

    
public static void swap(List<?> list, int i, int j) {
    swapHelper(list, i, j);
}

// 와일드카드 자료형을 포착하기 위한 private 도움 메서드
private static <E> void swapHelper(List<E> list, int i, int j) {
    list.set(i, list.set(j, list.get(i)));
}
