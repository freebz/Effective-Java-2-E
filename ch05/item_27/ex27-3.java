// 제네릭 메서드의 용례를 보이는 간단한 프로그램
public static void main(String[] args) {
    Set<String> guys = new HashSet<String>(
	Arrays.asList("Tom", "Dick", "Harry"));
    Set<String> stooges = new HashSet<String>(
	Arrays.asList("Larry", "Moe", "Curly"));
    Set<String> aflCio = union(guys, stooges);
    System.out.println(aflCio);
}
