// 인터페이스를 이용해 기존 enum 자료형을 확장하는 사례
public enum ExtendedOperation implements Operation {
    EXP("^") {
	public double apply(double x, double y) {
	    return Math.pow(x, y);
	}
    },
    REMAINDER("%") {
	public double apply(double x, double y) {
	    return x % y;
	}
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
	this.symbol = symbol;
    }

    @Override public String toString() {
	return symbol;
    }
}
