// 인터페이스를 이용해 확장 가능하게 만든 enum 자료형
public interface Operation {
    double apply(double x, double y);
}

public enum BasicOperation implements Operation {
    PLUS("+") {
	public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
	public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
	public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
	public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    BasicOperation(String symbol) {
	this.symbol = symbol;
    }

    @Override public String toString() {
	return symbol;
    }
}
