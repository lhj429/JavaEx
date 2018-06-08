package com.javaex.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {

		Goods notebook = new Goods();
		notebook.name = "노트북";
		notebook.price = 1000000;
		
		Goods camera = new Goods();
		camera.name = "캐논";
		camera.price = 500000;
		
		System.out.printf("%s, %d원%n", notebook.name, notebook.price);
		System.out.printf("%s, %d원", camera.name, camera.price);

		
	}

}
