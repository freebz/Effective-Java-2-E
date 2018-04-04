PECS (Produce - Extends, Consumer - Super)


    
static <E> E reduce(List<E> list, Function<E> f, E initVal)

// E 생산자 구실을 하는 인자에 와일드카드 자료형 적용
static <E> reduce(List<? extends E> list, Function<E> f,
		  E initVal)



public static <E> Set<E> union(Set<E> s1, Set<E> s2)


public static <E> Set<E> union(Set<? extends E> s1,
			       Set<? extends E> s2)
