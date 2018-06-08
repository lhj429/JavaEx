package com.javaex.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		//객체 추가
		list.add("Java"); //add 맨 뒤에 새 아이템 추가
		list.add("C");
		list.add("C++");
		list.add("Python");
		
		//객체를 중간에 삽입
		list.add(2, "C#");

		list.add("Java");
		System.out.println(list);
		System.out.println("size:" + list.size()); //capacity 확인 불가
		
		list.remove(2);
		System.out.println(list);
		
		list.remove("Python");
		System.out.println(list);
		
		//List, Set 등에서는 Iterator 사용
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
