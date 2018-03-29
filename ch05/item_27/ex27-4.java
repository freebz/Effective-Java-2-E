// 생성자를 통한 형인자 자료형 객체 생성
Map<String, List<String>> anagrams =
    new HashMap<String, List<String>>();



// 제네릭 정적 팩터리 메서드
public static <K,V> HashMap<K,V> newHashMap() {
    return new HashMap<K,V>();
}



// 정적 팩터리 메서드를 통한 형인자 자료형 객체 생성
Map<String, List<String>> anagrams = newHashMap();
