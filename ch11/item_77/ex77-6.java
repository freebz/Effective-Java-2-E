// Enum 싱글턴 - 더 바람직한 방법
public enum Elvis {
    INSTANCE;
    private String[] favoriteSongs =
        { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
	System.out.println(Arrays.toString(favoriteSongs));
    }
}
