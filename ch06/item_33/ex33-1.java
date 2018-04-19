class Herb {
    enum Type { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final Type type;

    Herb(String name, Type type) {
	this.name = name;
	this.type = type;
    }

    @Override public String toString() {
	return name;
    }
}
