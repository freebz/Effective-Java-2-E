@Override public PhoneNumber clone() {
    try {
	return (PhoneNumber) super.clone();
    } catch ( CloneNotSupportedException e ) {
	throw new AssertionError(); // 수행될 리 없음
    }
}
