public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    @Override public boolean equals(Object o) {
	if (!(o instanceof Point))
	    return false;
	Point p = (Point)o;
	return p.x == x && p.y == y;
    }

    ... // 이하 생략
}



public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
	super(x, y);
	this.color = color;
    }

    ... // 이하 생략
}



// 대칭성 위반!
@Override public boolean equals(Object o) {
    if (!(o instanceof ColorPoint))
	return false;
    return super.equals(o) && ((ColorPoint) o).color == color;
}



Point p = new Point(1, 2);
ColorPoint cp = new ColorPoint(1, 2, Color.RED);



// 추이성 위반!
@Override public boolean equals(Object o) {
    if (!(o instanceof Point))
	return false;

    // o가 Point 객체이면 색상은 비교하지 않음
    if (!(o instanceof ColorPoint))
	return o.equals(this);

    // o가 ColorPoint이므로 모든 정보를 비교
    return super.equals(o) && ((ColorPoint) o).color == color;
}



ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
Point p2 = new Point(1, 2);
ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);



// 리스코프 대체 원칙 위반 (53쪽)
@Override public boolean equals(Object o) {
    if (o == null || o.getClass() != getClass())
	return false;
    Point p = (Point) o;
    return p.x == x && p.y == y;
}



// 단위 원 상의 모든 점을 포함하도록 unitCircle 초기화
private static final Set<Point> unitCircle;
static {
    unitCircle = new HashSet<Point>();
    unitCircle.add(new Point( 1, 0));
    unitCircle.add(new Point( 0, 1));
    unitCircle.add(new Point(-1, 0));
    unitCircle.add(new Point( 0, -1));
}

public static boolean onUnitCircle(Point p) {
    return unitCircle.contains(p);
}



public class CounterPoint extends Point {
    private static final AtomicInteger counter =
	new AtomicInteger();

    public CounterPoint(int x, int y) {
	super(x, y);
	counter.incrementAndGet();
    }
    public int numberCreated() { return counter.get(); }
}
