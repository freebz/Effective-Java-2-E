// equals 규약을 위반하지 않으면서 값 컴포넌트 추가
public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
	if (color == null)
	    throw new NullPointerException();
	point = new Point(x, y);
	this.color = color;
    }

    /**
     * ColorPoint의 Point 뷰 반환
     */
    public Point asPoint() {
	return point;
    }

    @Override public boolean equals(Object o) {
	if (!(o instanceof ColorPoint))
	    return false;
	ColorPoint cp = (ColorPoint) o;
	return cp.point.equals(point) && cp.color.equals(color);
    }

    ... // 이하 생략
}
