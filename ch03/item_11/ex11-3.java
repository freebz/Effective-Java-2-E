public class HashTable implements Cloneable {
    private Entry[] buckets = ...;

    private static class Entry {
	final Object key;
	Object value;
	Entry next;

	Entry(Object key, Object value, Entry next) {
	    this.key = key;
	    this.value = value;
	    this.next = next;
	}
    }

    ... // 이하 생략
}



// 잘못된 코드. 두 객체가 내부 상태를 공유하게 된다.
@Override public HashTable clone() {
    try {
	HashTable result = (HashTable) super.clone();
	result.buckets = buckets.clone();
	return result;
    } catch (CloneNotSupportedException e) {
	throw new AssertionError();
    }
}
