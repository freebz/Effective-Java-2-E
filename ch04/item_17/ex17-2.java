public final class Sub extends Super {
    private final Date date; // 생성자가 초기화하는 final 필드

    Sub() {
	date = new Date();
    }

    // 상위 클래스 생성자가 호출하게 되는 재정의 메서드
    @Override public void overrideMe() {
	System.out.println(date);
    }

    public static void main(String[] args) {
	Sub sub = new Sub();
	sub.overrideMe();
    }
}
