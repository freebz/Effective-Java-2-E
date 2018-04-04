// int를 사용한 enum 패턴 - 지극히 불만족스럽다
public static final int APPLE_FUJI = 0;
public static final int APPLE_PIPPIN = 1;
public static final int APPLE_GRANNY_SMITH = 2;

public static final int ORANGE_NAVEL = 0;
public static final int ORANGE_TEMPLE = 1;
public static final int ORANGE_BLOOD = 2;



// 귤 맛 나는 사과 주스!
int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;



public enum Apple  { FUJI, PIPPIN, GRANNY_SMITH }
public enum Orange { NAVEL, TEMPLE, BLOOD }
