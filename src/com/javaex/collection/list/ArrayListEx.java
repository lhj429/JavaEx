package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<String>();
		List<String> list = new LinkedList<String>();
		
		//객체 추가
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Python");
		System.out.println(list);
		
		//객체 삽입
		list.add(2, "C#");
		System.out.println(list);
		
		list.add("Java");
		System.out.println(list);
		
		list.remove(2);
		list.remove("Python");
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String item = it.next();
			System.out.print(item + " ");
		}
		
		System.out.println();
		
		list.clear();
		System.out.println(list);
		
	}

}
