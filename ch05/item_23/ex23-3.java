// 실행 도중에 오류를 일으키는 무인자 자료형 (List) 사용 예
public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    unsafeAdd(strings, new Integer(42));
    String s = strings.get(0); // 컴파일러가 자동으로 형변환
}
private static void unsafeAdd(List list, Object o) {
    list.add(o);
}
