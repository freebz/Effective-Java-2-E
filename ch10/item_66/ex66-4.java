// 잘못된 예제 - 동기화가 필요하다!
private static volatile int nextSerialNumber = 0;

public static int generateSerialNumber() {
    return nextSerialNumber++;
}
