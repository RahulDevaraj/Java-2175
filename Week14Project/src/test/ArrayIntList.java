package test;

import java.util.ArrayList;

public class ArrayIntList {
	
	ArrayList<Integer> list = null;
	public ArrayIntList() {
	list = new ArrayList<Integer>();
	}
	public ArrayIntList(int value) {
	list = new ArrayList<Integer>();
	list.add(value);
	}
	public void add(int value) {
	list.add(value);
	}
	public void add(int pos, int value) {
	list.add(pos, value);
	}
	public void remove(int pos) {
	list.remove(pos);
	}
	public int indexOf(int value) {
	return list.indexOf(value);
	}
	public boolean isEmpty() {
	return list.isEmpty();
	}
	public boolean contains(int value) {
	return list.contains(value);
	}
	public int get(int pos) {
	return list.get(pos);
	}
	public int size() {
	return list.size();
	}
	public String toString() {
	return list.toString();
	}

}
