public class ElvisStealer implements Serializable {
    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
	// 아직 "resolve"되지 않은 Elvis 객체에의 참조 저장
	impersonator = payload;

	// favoriteSongs 필드의 자료형에 맞는 객체 반환
	return new String[] { "A Fool Such as I" };
    }
    private static final long serialVersionUID = 0;
}
