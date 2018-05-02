// 컬렉션이나 배열에 대한 순환문을 중첩시킬 때 따라야 할 숙어
for (Suit suit : suits)
    for (Rank rank : ranks)
	deck.add(new Card(suit, rank));
