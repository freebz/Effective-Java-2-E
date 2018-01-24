public int compareTo(PhoneNumber pn) {
    // 지역 번호 비교
    int areaCodeDiff = areaCode - pn.areaCode;
    if (areaCodeDiff != 0)
	return areaCodeDiff;

    // 지역 번호가 같으니 국번 비교
    int prefixDiff = prefix - pn.prefix;
    if (prefixDiff != 0)
	return prefixDiff;

    // 지역 번호와 국번이 같으므로 회선 번호 비교
    return lineNumber - pn.lineNumber;
}
