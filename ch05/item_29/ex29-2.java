public <T extends Annotation>
    T getAnnotation(Class<T> annotationType);



// 한정적 자료형 토큰으로 안전하게 형변환하기 위해 asSubclass를 이용한 사례
static Annotation getAnnotation(AnnotatedElement element,
				String annotationTypeName) {
    Class<?> annotationType = null;  // 비한정적 자료형 토큰
    try {
	annotationType = Class.forName(annotationTypeTypeName);
    } catch (Exception ex) {
	throw new IllegalArgumentException(ex);
    }
    return element.getAnnotation(
	annotationType.asSubclass(Annotation.class));
}
