// 객체 생성은 리플렉션으로, 참조와 사용은 인터페이스로
public static void main(String[] args) {
    // 클래스 이름을 Class 객체로 변환
    Class<?> cl = null;
    try {
	cl = Class.forName(args[0]);
    } catch(ClassNotFoundException e) {
	System.err.println("Class not found.");
	system.exit(1);
    }

    // 해당 클래스의 객체 생성
    Set<String> s = null;
    try {
	s = (Set<String>) cl.newInstance();
    } catch(IllegalAccessException e) {
	System.err.println("Class not accessible.");
	System.exit(1);
    } catch(InstantiationException e) {
	System.err.println("Class not instantiable.");
	System.exit(1);
    }

    // 집합 이용
    s.addAll(Arrays.asList(args).subList(1, args.length));
    System.out.println(s);
}
