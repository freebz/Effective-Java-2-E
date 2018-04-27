if (m.isAnnotationPresent(ExceptionTest.class)) {
    tests++;
    try {
	m.invoke(null);
	System.out.printf("Test %s failed: no exception%n", m);
    } catch (InvocationTargetException wrappedEx) {
	Throwable exc = wrappedEx.getCause();
	Class<? extends Exception> excType =
	    m.getAnnotation(ExceptionTest.class).value();
	if (execType.isInstance(exc)) {
	    passed++;
	} else {
	    System.out.printf(
		"Test %s failed: expected %s, got %s%n",
		m, excType.getName(), exc);
	}
    } catch (Exception exc) {
	System.out.println("INVALID @Test: " + m);
    }
}
