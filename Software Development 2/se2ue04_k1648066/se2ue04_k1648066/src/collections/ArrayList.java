package collections;

import java.util.Iterator;

import inout.Out;

import java.util.Arrays;

public class ArrayList<T> implements Iterable<T>, List<T>{
	T[] elements = (T[]) new EntryBasedMap.Entry[1];
	private int size = elements.length;


	@Override
	public void add(T elem) {
		int i = 0;
		if (elements[elements.length - 1] != null) {
			T[] oldElements = (T[]) new EntryBasedMap.Entry[size];
			System.arraycopy(elements, 0, oldElements, 0, elements.length);
			size = size * 2;
			elements = (T[]) new EntryBasedMap.Entry[size];
			System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
		}
		for (Iterator<T> it = iterator(); it.hasNext(); i++) {
		    if (elements[i] == null) {
		    	elements[i] = elem;
		    	break;
		    }
		    it.next();
		}

		
	}

	@Override
	public T get(int i) {
		if (i < 0 || i >= elements.length) {
			return null;
		}
		else {
			return elements[i];
		}
}

	@Override
	public boolean remove(T elem) {
		int i = 0;
		for (Iterator<T> it = iterator(); it.hasNext(); i++) {
		    if (elements[i] == elem) {
		    	elements[i] = null;
		    	if (i < elements.length - 1) {
			    	T[] oldElements = (T[]) new EntryBasedMap.Entry[elements.length - i - 1];
			    	System.arraycopy(elements, i + 1, oldElements, 0, elements.length - i -1);
			    	System.arraycopy(oldElements, 0, elements, i, oldElements.length);
			    	elements[i + oldElements.length] = null;
		    	}
		    	return true;
		    }
		    it.next();
		}
		return false;
	}

	@Override
	public boolean contains(Object obj) {
		int i = 0;
		for (Iterator<T> it = iterator(); it.hasNext(); i++) {
		    if (elements[i].equals(obj)) {
		    	return true;
		    }
		    it.next();
		}
		return false;
	}

	@Override
	public int size() {
		int i = 0;
		int items = 0;
		for (Iterator<T> it = iterator(); it.hasNext(); i++) {
		    if (elements[i] != null) {
		    	items++;
		    }
		    it.next();
		}
		return items;
	}
	@Override
	public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            public int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return elements[currentIndex++];
            }

        };
        return it;
	}

}
