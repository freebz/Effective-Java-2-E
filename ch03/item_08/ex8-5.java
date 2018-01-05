@Override public Boolean equals(Object o) {
    if ( o == null )
	return false;
    ...
}



@Override public Boolean equals(Object o) {
    if ( !(o instanceof MyType) )
	return false;
    MyType mt = (MyTYpe) o;
    ...
}
