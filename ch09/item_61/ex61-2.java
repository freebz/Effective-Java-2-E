/**
 * Returns the element at the specified position in this list.
 * @throws IndexOutOfBoundsException if the index is out of range
 *         ({@code index < 0 || index >= size()}).
 */
public E get(int index) {
    ListIterator<E> i = listIterator(index);
    try {
	return i.next();
    } catch(NoSuchElementException e) {
	throw new IndexOutOfBoundsException("Index: " + index);
    }
}
