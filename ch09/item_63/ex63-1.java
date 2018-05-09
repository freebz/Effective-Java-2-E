/**
 * Construct an IndexOutOfBoundsException.
 *
 * @param lowerBound the lowest legal index value.
 * @param upperBound the highest legal index value plus one.
 * @param index the actual index value.
 */
public IndexOutOfBoundsException(int lowerBound, int upperBound,
				 int index) {
    // 오류를 포착하는 상세 메시지 생성
    super("Lower bound: " + lowerBound +
	  ", Upper bound: " + upperBound +
	  ", Index: " + index);

    // 프로그램에서 이용할 수 있도록 오류 정보 보관
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.index = index;
}
