public int compareTo(PhoneNumber pn) {
    // 지역 번호 비교
    if (areaCode < pn.areaCode)
	return -1;
    if (areaCode > pn.areaCode)
	return 1;
    // 지역 번호가 같으니 국번 비교
    if (prefix < pn.prefix)
	return -1;
    if (prefix > pn.prefix)
	return 1;
    // 지역 번호와 국번이 같으므로 회선 번호 비교
    if (lineNumber < pn.lineNumber)
	return -1;
    if (lineNumber > pn.lineNumber)
	return 1;

    return 0; // 모든 필드가 일치
}
