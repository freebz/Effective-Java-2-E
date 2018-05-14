// ConcurrentMap으로 구현한 병행 정규화 맵 - 최적이 아님
private stati final ConcurrentMap<String, String> map =
    new ConcurrentHashMap<String, String>();

public static String intern(String s) {
    String previousValue = map.putIfAbsent(s, s);
    return previousValue == null ? s : previousValue;
}
