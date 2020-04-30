package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] t;
	
	public ArrayList() {
		t = (T[]) new Object[0];            
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return t[loc];
	}
	
	public void add(T val) {
		T[] a = (T[]) new Object[t.length + 1];
		for(int i = 0; i < t.length; i++) {
			a[i] = t[i];
		}
		a[a.length - 1] = val;
		t = a;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] a = (T[]) new Object[t.length + 1];
		for(int i = 0; i < a.length; i++) {
			if(i < loc) {
				a[i] = t[i];
			}
			else if(i == loc) {
				a[i] = val;
			}
			else {
				a[i] = t[i - 1];
			}
		}
		t = a;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		t[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] a = (T[]) new Object[t.length - 1];
		for(int i = 0; i < loc; i++) {
			a[i] = t[i];
		}
		for(int i = loc; i < a.length; i++) {
			a[i] = t[i + 1];
		}
		t = a;
	}
	
	public boolean contains(T val) {
		for(T a : t) {
			if(a.equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return t.length;
	}
}