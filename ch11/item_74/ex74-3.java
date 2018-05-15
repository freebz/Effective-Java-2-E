// 직렬화가 불가능한 상태유지(stateful) 클래스, 하지만 직렬화가 가능한
// 하위 클래스를 만들 수 있다.
public abstract class AbstractFoo {
    private int x, y; // 상태

    // 아래 enum과 필드는 초기화 과정을 추적하기 위한 것이다
    private enum State { NEW, INITIALIZING, INITIALIZED };
    private final AtomicReference<State> init =
	new AtomicReference<State>(State.NEW);

    public AbstractFoo(int x, int y) { initialize(x, y); }

    // 이 생성자와 그 아래 메서드는 하위 클래스의 readObject 메서드가
    // 상태를 초기화할 수 있도록 하기 위한 것이다.
    protected AbstractFoo() { }
    protected final void initialize(int x, int y) {
	if (!init.compareAndSet(State.NEW, State.INITIALIZING))
	    throw new IllegalStateException(
		"Already initialized");
	this.x = x;
	this.y = y;
	... // 원래 생성자가 하던 나머지 작업
	init.set(State.INITIALZED);
    }

    // 이 메서드들은 하위 클래스의 writeObject 메서드에 의해 객체가
    // 수동적으로 직렬화될 수 있도록 내부 상태 정보를 제공하는 역할을 한다.
    protected final int getX() { checkInit(); return x; }
    protected final int getY() { checkInit(); return y; }

    // 모든 public 및 protected 객체 메서드에서 반드시 호출해야 하는 메서드
    private void checkInit() {
	if (init.get() != State.INITALIZED)
	    throw new IllegalSTateException("Uninitialized");
    }

    ... // 이하 생략
}
