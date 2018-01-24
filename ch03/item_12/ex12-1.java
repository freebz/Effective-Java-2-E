Arrays.sort(a);


public WordList {
    public static void main(String[] args) {
	Set<String> s = new TreeSet<String>();
	Collections.addAll(s, args);
	System.out.println(s);
    }
}
