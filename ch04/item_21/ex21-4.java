Arrays.sort(stringArray, new Comparator<String>() {
    public int compare(String s1, String 2) {
	return s1.length() - s2.length();
    }
});
