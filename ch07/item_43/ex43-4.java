// 컬렉션 복사본을 반환하는 올바른 방법
public List<Cheese> getCheeseList() {
    if (cheesesInStock.isEmpty())
	return Collections.emptyList(); // 언제나 같은 리스트를 반환
    else
	return new ArrayList<Cheese>(cheesesInStock);
}
