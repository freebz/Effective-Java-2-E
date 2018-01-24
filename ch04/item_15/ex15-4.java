// 생성자 대신 정적 팩터리 메서드를 제공하는 변경 불가능 클래스
public class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
	this.re = re;
	this.im = im;
    }

    public static Complex valueOf(double re, double im) {
	return new Complex(re, im);
    }

    ... // 나머지는 동일
}
