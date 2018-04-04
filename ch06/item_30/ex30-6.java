// 상수별로 클래스 몸체와 별도 데이터를 갖는 enum 자료형
public enum Operation {
    PLUS("+") {
	double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
	double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
	double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
	double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    Operation(String symbol) { this.symbol = symbol; }
    @Override public String toString() { return symbol; }

    abstract double apply(double x, double y);
}
