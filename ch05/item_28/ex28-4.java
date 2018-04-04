Set<Integer> integers = ...;
Set<Double> doubles = ...;
Set<Number> numbers = union(integers, doubles);


Union.java:14: incompatible types
found : Set<Number & Comparable<? extends Number &
				          Comparable<?>>>
required: Set<Number>
        Set<Number> numbers = union(integers, doubles);
                                   ^


Set<Number> numbers = Union.<Number>union(integers, doubles);
