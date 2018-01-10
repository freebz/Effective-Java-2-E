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

	// 이 Entry 객체가 첫 원소인 연결 리스트를 재귀적으로 복사
	Entry deepCopy() {
	    return new Entry(key, value,
	        next == null ? null : next.deepCopy());
	}
    }
    
    @Override public HashTable clone() {
	try {
	    HashTable result = (HashTable) super.clone();
	    result.buckets = new Entry[buckets.length];
	    for (int i = 0; i < buckets.length; i++)
		if (buckets[i] != null)
		    result.buckets[i] = buckets[i].deepCopy();
	    return result;
	} catch (CloneNotSupportedException e) {
	    throw new AssertionError();
	}
    }
    ... // 이하 생략
}



// 이 Entry 객체가 첫 원소인 연결 리스트를 순환문으로 복사
Entry deepCopy() {
    Entry result = new Entry(key, value, next);

    for (Entry p = result; p.next != null; p = p.next)
	p.next = new Entry(p.next.key, p.next.value, p.next.next);

    return result;
}
