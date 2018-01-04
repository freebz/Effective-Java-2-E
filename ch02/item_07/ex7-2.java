// 수동 종료자 연결(Manual finalizer chaining)
@Override protected void finalize() throws Throwable {
    try {
	... // 하위 클래스의 상태를 종료함
    } finally {
	super.finalize();
    }
}
