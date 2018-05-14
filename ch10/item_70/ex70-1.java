Map<K, V> m = Collections.synchronizedMap(new HashMap<K, V>());
    ...
Set<K> s = m.keySet();  // 동기화 블록 안에 있을 필요 없음
    ...
synchronized(m) {  // s가 아니라 m에 대해 동기화!
    for (K key : s)
	key.f();
}
