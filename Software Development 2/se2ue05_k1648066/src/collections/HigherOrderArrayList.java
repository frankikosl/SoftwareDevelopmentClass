package collections;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HigherOrderArrayList<T> extends ArrayList<T>{
	
	public <R> List<R> map(Function<? super T, ? extends R> mapper) {
		ArrayList<R> result = new HigherOrderArrayList<R>();
		for (int i = 0; i < this.size(); i++) {
			R r = mapper.apply(this.get(i));
			result.add(r);
		}
		return (List<R>) result;
	}
	@Override
	public List<T> filter(Predicate<? super T> predicate) {
		ArrayList<T> result = new HigherOrderArrayList<T>();
		for (int i = 0; i < this.size(); i++) {
			if (predicate.test(this.get(i))) {
				T t = this.get(i);
				result.add(t);
			}
		}
		return (List<T>) result;
	}
	@Override
	public void forEach(Consumer<? super T> action) {
		for (int i = 0; i < this.size(); i++) {
			action.accept(this.get(i));
		}
		
	}
	@Override
	public T reduce(T identity, BinaryOperator<T> accumulator) {
		for (int i = 0; i < this.size(); i++) {
			identity = accumulator.apply(identity, this.get(i));
		}
		return identity;
	}

}