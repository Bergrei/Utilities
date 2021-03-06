package org.tonerds.utilities;

public class Pair <T1, T2> {
	public T1 first;
	public T2 second;
	
	public Pair() {}
	
	public Pair(T1 first, T2 second) {
		this.first = first;
		this.second = second;
	}
	
	public <T> boolean contains (T element) {
		if (element == first){
			return true;
		}
		if (element == second){
			return true;
		}
		return false;
	}
	
	@Override
	public Pair<T1, T2> clone(){
		return new Pair<T1, T2>(first, second);
	}
}
