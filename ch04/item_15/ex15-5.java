public static Complex valueOfPolar(double r, double theta) {
    return new Complex(r * Math.cos(theta),
		       r * Math.sin(theta));
}
