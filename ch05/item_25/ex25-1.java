// 실행 중에 문제를 일으킴
Object[] objectArray = new Long[1];
objectArray[0] = "I don't fit in";  // ArrayStoreException 예외 발생


// 컴파일 되지 않는 코드
List<Object> ol = new ArrayList<Long>();  // 자료형 불일치
ol.add("I don't fit in");
