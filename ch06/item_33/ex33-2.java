// ordinal() 값을 배열 첨자로 사용 - 이러시면 곤란합니다
Herb[] garden = ...;

Set<Herb>[] herbsByType = // Indexed by Herb.Type.ordinal()
    (Set<Herb>[]) new Set[Herb.Type.values().length];
for (int i = 0; i < herbsByType.length; i++)
    herbsByType[i] = new HashSet<Herb>();

for (Herb h : garden)
    herbsByType[h.type.ordinal()].add(h);

// 결과 출력
for (int i = 0; i < herbsByType.length; i++) {
    System.out.printf("%s: %s%n",
		      Herb.Type.values()[i], herbsByType[i]);
}
