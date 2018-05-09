// 무시무시할 정도로 느린 프로그램. 어디서 객체가 생성되는지 알겠는가?
public static void main(String[] args) {
    Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
	sum += i;
    }
    System.out.println(sum);
}
