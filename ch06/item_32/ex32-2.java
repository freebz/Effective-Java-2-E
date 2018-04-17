// EnumSet - 비트 필드를 대신할 현대적 기술
public class Text {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    // 어떤 Set 객체도 인자로 전달할 수 있으나, EnumSet이 분명 최선
    public void applyStyles(Set<Style> styles) { ... }
}



text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
