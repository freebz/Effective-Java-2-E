// 형 안전 다형성(heterogeneous) 컨테이너 패턴 - API
public class Favorites {
    public <T> void putFavorite(Class<T> type, T instance);
    public <T> T getFavorite(Class<T> type);
}


// 형 안전 다형성(heterogeneous) 컨테이너 패턴 - 클라이언트
public static void main(Strng[] args) {
    Favorites f = new Favorites();
    f.putFavorite(String.class, "Java");
    f.putFavorite(Integer.class, 0xcafebabe);
    f.putFavorite(Class.class, Favorites.class);
    String favoriteString = f.getFavorite(String.class);
    int favoriteInteger = f.getFavorite(Integer.class);
    Class<?> favoriteClass = f.getFavorite(Class.class);
    System.out.printf("%s %x %s%n", favoriteString,
        favoriteInteger, favoriteClass.getName());
}


// 형 안전 다형성(heterogeneous) 컨테이너 패턴 - 구현
public class Favorites {
    private Map<Class<?>, Object> favorites =
	new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
	if (type == null)
	    throw new NullPointerException("Type is null");
	favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
	return type.cast(favorites.get(type));
    }
}



public class Class<T> {
    T cast(Object obj);
}



// 동적 형변환으로 실행시간 형 안전성 확보
public <T> void putFavorite(Class<T> type, T instance) {
    favorites.put(type, type.cast(instance));
}
