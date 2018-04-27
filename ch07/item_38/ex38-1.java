/**
 * (this mod m)인 BigInteger 값 반환. 이 메서드는 remainder 메서드와는
 * 다르다. remainder 메서드는 항상 음수 아닌 BigInteger 객체를 반환한다.
 *
 * @param mod 연산을 수해할 값. 반드시 양수.
 * @return this mod m
 * @throws ArithmeticException (m <= 0일 때)
 */
public BigInteger mod(BigInteger m) {
    if (m.signum() <= 0)
	throw new ArithmeticException("Modules <= 0: " + m);
    ... // 계산 수행
}
