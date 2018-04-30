public static String classify(Collection<?> c) {
    return c instanceof Set ? "Set" :
	c instanceof List ? "List" : "Unknown Collection";
}
