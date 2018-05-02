// 컬렉션에서 배열을 만들어 반환하는 올바른 방법
private final List<Cheese> cheesesInStock = ...;

private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

/**
 * @return 재고가 남은 모든 치즈 목록을 배열로 만들어 반환
 */
public Cheese[] getCheeses() {
    return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
}
