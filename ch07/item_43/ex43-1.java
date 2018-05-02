private final List<Cheese> cheesesInStock = ...;

/**
 * @return 재고가 남은 모든 치즈를 반환. 치즈가 남지 않았을 때는
 * null을 반환.
 */
public Cheese[] getCheeses() {
    if (cheeseInStock.size() == 0)
	return null;
    ...
}
