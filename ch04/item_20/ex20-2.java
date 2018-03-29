// 태그 기반 클래스를 클래스 계층으로 변환한 결과
abstract class Figure {
    abstract double area();
}

class Circle extends Figure {
    final double radius;

    Circle(double raidus) { this.radius = radius; }

    double area() { return Math.PI * (radius * radius); }
}


class Rectangle extends Figure {
    final double length;
    final double width;
    
    Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
    }

    double area() { return length * width; }
}
