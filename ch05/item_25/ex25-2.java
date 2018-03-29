// 제네릭 배열 생성이 혀용되지 않는 이유 - 아래의 코드는 컴파일되지 않는다!
List<String>[] stringLists = new List<String>[1];
List<Integer> intList = Arrays.asList(42);
Object[] objects = stringList;
objects[0] = intList;
String s = stringLists[0].get(0);
