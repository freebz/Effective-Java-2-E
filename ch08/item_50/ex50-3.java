public class ThreadLocal {
    private ThreadLocal() { }  // 객체를 만들 수 없다

    public static class Key {  // (권한)
	Key() { }
    }

    // 유일성이 보장되는, 위조 불가능 키를 생성
    public static Key getKey() {
	return new Key();
    }
    
    public static void set(Key key, Object value);
    public static Object get(Key key);
}
