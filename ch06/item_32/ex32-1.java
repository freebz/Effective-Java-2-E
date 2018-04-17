// 비트 필드 열거형 상수 - 이제는 피해야 할 구현법
public class Text {
    public static final int STYLE_BOLD            = 1 << 0; // 1
    public static final int STYLE_ITALIC          = 1 << 1; // 2
    public static final int STYLE_UNDERLINE       = 1 << 2; // 4
    public static final int STYLE_STRIKETHROUGH   = 1 << 3; // 8

    // 이 메서드의 인자는 STYLE_상수를 비트별(BITWISE) or 한 값이거나 0.
    public void applyStyles(int styles) { ... }
}



text.applyStyles(STYLE_BOLD | STYLE_ITALIC);
