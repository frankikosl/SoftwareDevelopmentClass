package collections;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface List<T> extends Iterable<T> {
    /**
     * Adds an element to the end of the list
     * @param elem The element to add
     */
    public void add(T elem);

    /**
     * Returns the object at index i, or null if the index is out of bounds.
     * @param i The index which's object should be returned
     * @return The object at index i or null if the index is invalid
     */
    public T get(int i);

    /**
     * Removes the first occurrence of an element from this list if the element is contained at least one time
     * @param elem The element to remove
     * @return True if an element has been removed, otherwise false
     */
    public boolean remove(T elem);

    /**
     * Checks if a given object is present in this list.
     * Objects are compared using the equals() method.
     * @param obj The object which should be checked for presence in this list
     * @return True if this list contains the given object at least once, otherwise false
     */
    public boolean contains(Object obj);

    /**
     * Returns the number of entries in this list
     * @return The number of entries
     */
    public int size();


    <R> List<R> map(Function<? super T, ? extends R> mapper);

    List<T> filter(Predicate<? super T> predicate);

    void forEach(Consumer<? super T> action);

    T reduce(T identity, BinaryOperator<T> accumulator);
}
