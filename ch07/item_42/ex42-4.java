List<String> homophones = Arrays.asList("to", "too", "two");


// 이제는 이렇게 하면 안 된다
System.out.println(Arrays.asList(myArray));



public static void main(String[] args) {
    int[] digits = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 4 };
    System.out.println(Arrays.asList(digits));
}


Va.java:6: asList(Object[]) in Arrays can't be applied to (int[])
        System.out.println(Arrays.asList(digits));
