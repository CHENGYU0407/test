package com.spring.demo;

import java.util.List;
import java.util.Map;

public class ArrayAndCollectionInjectionTest {
int[] array;
List<Book> list;
Map<Integer,Integer> map;
public int[] getArray() {
	return array;
}
public void setArray(int[] array) {
	this.array = array;
}
public List<Book> getList() {
	return list;
}
public void setList(List<Book> list) {
	this.list = list;
}
public Map<Integer, Integer> getMap() {
	return map;
}
public void setMap(Map<Integer, Integer> map) {
	this.map = map;
}

}
