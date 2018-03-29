// 무인자 자료형 사용 - 권할 수 없는 방법(규칙 23)
public static Set union(Set s1, Set s2) {
    Set result = new HashSet(s1);
    result.addAll(sw);
    return result;
}
