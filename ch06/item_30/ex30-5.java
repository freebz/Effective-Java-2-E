// 상수별 메서드 구현을 이용한 enum 자료형
public enum Operation {
    PLUS      { double apply(double x, double y){return x + y;} },
    MINUS     { double apply(double x, double y){return x - y;} },
    TIMES     { double apply(double x, double y){return x * y;} },
    DIVIDE    { double apply(double x, double y){return x / y;} };

    abstract double apply(double x, double y);
}
