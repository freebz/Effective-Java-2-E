// 고치긴 했는데 코드가 보기 싫다 - 이보다는 잘 할 수 있다!
for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
    Suit suit = i.next();
    for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
	deck.add(new Card(suit, j.next()));
}
