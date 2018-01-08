// 가장 끔찍한 형태의 해시 함수. 절대로 이렇게 구현하지 말것.
@Override public int hashCode() { return 42; }



@Override public int hashCode() {
    int result = 17;
    result = 31 * result + areaCode;
    result = 31 * result + prefix;
    result = 31 * result + lineNumber;
    return result;
}



// 초기화 지연 기법을 사용해 해시 코드 캐싱
private volatile int hashCode; // (규칙71참조)

@Override public int hashCode() {
    int result = hashCode;
    if (result == 0) {
	result = 17;
	result = 31 * result + areaCode;
	result = 31 * result + prefix;
	result = 31 * result + lineNumber;
	hashCode = result;
    }
    return result;
}
