package com.javaex.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {

		/*Goods notebook = new Goods();
		notebook.setName("노트북");
		notebook.setPrice(1000000);
		
		Goods camera = new Goods();
		camera.setName("캐논");
		camera.setPrice(500000);*/
		
		Goods notebook = new Goods("노트북", 1000000);
		Goods camera = new Goods("캐논", 700000);
		
		/*System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %d원%n", camera.getName(), camera.getPrice());*/

		notebook.showInfo();
		camera.showInfo();
		
		
	}

}
