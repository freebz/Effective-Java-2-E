// 문자열을 연결하는 잘못된 방법 - 성능이 엉망이다
public String statement() {
    String result = "";
    for (int i = 0; i < numItems(); i++)
	result += lineForItem(i); // String concatenation
    return result;
}
