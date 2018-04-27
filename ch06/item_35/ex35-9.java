if (m.isAnnotationPresent(ExceptionText.class)) {
    tests++;
    try {
	m.invoke(null);
	System.out.printf("Test %s failed: no exception%n", m);
    } catch (Throwable wrappedExc) {
	Throwable exc = wrappedExc.getCause();
	Class<? extends Exception>[] excTypes =
	    m.getAnnotation(ExceptionTest.class).value();
	int oldPassed = passed;
	for (Class<? extends Exception> excType : excTypes) {
	    if (excType.isInstance(exc)) {
		passed++;
		break;
	    }
	}
	if (passed == oldPassed)
	    System.out.printf("Test %s failed: %s %n", m, exc);
    }
}
