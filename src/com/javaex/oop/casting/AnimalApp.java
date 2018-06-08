package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {

		//Up-Casting
		Animal dog1 = new Dog("Snoopy");
		dog1.eat();
		dog1.walk();
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		//Down-Casting
		((Dog)dog1).bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		} else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
	}

}
