package collections;

import java.util.Iterator;

import inout.Out;

public class EntryBasedMap<K, V> implements Map<K, V> {
	public final ArrayList<Entry<K, V>> entries = new ArrayList<>();
	@Override
	public void put(K key, V value) {
		int i = 0;
		boolean found = false;
		Entry<K, V> entry = new Entry<K, V>(key, value);
		for (Iterator<K> it = keyIterator(); it.hasNext(); i++) {
			if (entries.elements[i] != null) {
			    if (entries.elements[i].getKey().equals(entry.getKey())) {
			    	entries.elements[i].value = entry.getValue();
			    	found = true;
			    	break;
			    }
			    it.next();
			}

		}
		if (!found) {
			entries.add(entry);
		}
		
	}

	@Override
	public V get(K key) {
		int i = 0;
		for (Iterator<K> it = keyIterator(); it.hasNext(); i++) {
		    if (entries.elements[i].getKey() == key) {
		    	return entries.elements[i].getValue();
		    }
		    it.next();
		}
		return null;
	}

	@Override
	public boolean contains(K key) {
		int i = 0;
		for (Iterator<K> it = keyIterator(); it.hasNext(); i++) {
		    if (entries.elements[i].getKey() == key) {
		    	return true;
		    }
		    it.next();
		}
		return false;
	}

	@Override
	public boolean remove(K key) {
		int i = 0;
		for (Iterator<K> it = keyIterator(); it.hasNext(); i++) {
			if(entries.elements[i] != null) {
			    if (entries.elements[i].getKey().equals(key)) {
			    	entries.remove(entries.elements[i]);
			    	return true;
			    }
			}
		    it.next();
		}
		return false;
	}

	@Override
	public int size() {
		return entries.size();
	}

	public class Entry<K,V> implements Tuple<K, V>{
		private final K key;
		private V value;
		
		private Entry(K key, V value){
			this.key = key;
			this.value = value;
		}
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}
		
	}
	class KeyIterator<K> extends IteratorBase implements Iterator<K>{

        public int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < entries.size();
        }

        @Override
        public K next() {
            return (K) entries.elements[currentIndex++].getKey();
        }
		
	}
	class ValueIterator<V> extends IteratorBase implements Iterator<V>{

        public int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < entries.size();
        }

        @Override
        public V next() {
            return (V) entries.elements[currentIndex++].getValue();
        }
		
	}
	 public class EntryIterator<K, V> extends IteratorBase implements Iterator<Tuple<K, V>>{
        public int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < entries.size();
        }

        @Override
        public Tuple<K, V> next() {
            return (Tuple<K, V>) entries.elements[currentIndex++];
        }
		
	}
	private abstract class IteratorBase{
		public abstract boolean hasNext();
		public abstract Object next();
	}
	@Override
	public Iterator<K> keyIterator() {
        Iterator<K> it = new Iterator<K>() {

            public int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < entries.size();
            }

            @Override
            public K next() {
                return entries.elements[currentIndex++].getKey();
            }

        };
        return it;
	}

	@Override
	public Iterator<V> valueIterator() {
        Iterator<V> it = new Iterator<V>() {

            public int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < entries.size();
            }

            @Override
            public V next() {
                return entries.elements[currentIndex++].getValue();
            }

        };
        return it;
	}

	@Override
	public Iterator<Tuple<K, V>> iterator() {
		Iterator<Tuple<K, V>> it = new Iterator<Tuple<K, V>>() {

            public int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < entries.size();
            }

            @Override
            public Tuple<K, V> next() {
                return entries.elements[currentIndex++];
            }

        };
        return it;
	}

}
