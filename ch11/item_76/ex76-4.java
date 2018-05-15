public class MutablePeriod {
    // Period 객체
    public final Period period;

    // 객체의 start 필드. 원래는 접근할 수 없어야 한다.
    public final Date start;

    // 객체의 end 필드. 원래는 접근할 수 없어야 한다.
    public final Date end;

    public MutablePeroid() {
	try {
	    ByteArrayOutputStream bos =
		new ByteArrayOutputStream();
	    ObjectOutputStream out =
		new ObjectOutputStream(bos);

	    // 유효한 Period 객체를 직렬화
	    out.writeObject(new Period(new Date(), new Date()));

	    /*
	     * 악의적인 "previous object refs"를 추가.
	     * Period 내부의 Date 필드에 대한 것이다. 상세한 내용은
	     * "Java 객체 직렬화 명세서(Java Object Serialization
	     * Specification)"의 6.4절 참조.
	     */
	    byte[] ref = { 0x71, 0, 0x7e, 0, 5 };  // Ref #5
	    bos.write(ref);  // start 필드
	    ref[4] = 4;      // Ref #4
	    bos.write(ref);  // end 필드

	    // Period와 "훔쳐낸(stolen)" Date 참조를 역직렬화
	    ObjectInputStream in = new ObjectInputStream(
		new BytearrayInputStream(bos.toByteArray()));
	    period = (Period) in.readObject();
	    start  = (Date)   in.readObject();
	    end    = (Date)   in.readObject();
	} catch (Exception e) {
	    throw new AssertionError(e);
	}
    }
}
