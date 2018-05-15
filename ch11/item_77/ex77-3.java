// 잘못된 싱글턴 - 비-trasient 객체 참조 필드가 있다!
public class Elvis implements Serializable {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() { }

    private String[] favoriteSongs =
    { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
	System.out.println(Arrays.toString(favoriteSongs));
    }

    private Object readResolve() {
	return INSTANCE;
    }
}
