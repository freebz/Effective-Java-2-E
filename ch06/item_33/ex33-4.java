// ordinal() 값을 배열의 배열 첨자로 사용 - 이러시면 안 됩니다
public enum Phase { SOLID, LIQUID, GAS;
    public enum Transition {
	MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

	// 아래 배열의 행은 상전이 이전 상태를 나타내는 enum 상수의 ordinal 값을
	// 첨자로 사용하고, 열은 상전이 이후 상태를 나타내는 enum 상수의
	// ordinal 값을 첨자로 사용한다.
	private static final Transition[][] TRANSITIONS = {
	    { null, MELT, SUBLIME },
	    { FREEZE, null, BOIL },
	    { DEPOSIT, CONDENSE, null }
	};

	// 특정 상전이 과정을 표현하는 enum 상수를 반환
	public static Transition from(Phase src, Phase dst) {
	    return TRANSITION[src.ordinal()][des.ordinal()];
	}
    }
}
