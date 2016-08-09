package com.jonpack.zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Animal> ourZoo = new ArrayList<>(10);
		
		Bovine cow1 = new Bovine("Betsy", "brown", "Female", 2, 6.0f, 0, 4);
		Bovine cow2 = new Bovine("Charles", "Black", "male", 2, 6.2f, 2, 4);
		Canine dog1 = new Canine("Doug", "Golden", "Male", 2, 3.2f, 4, 25, true);
		Canine wolf1 = new Canine("Lupin", "Gray", "Male", 2, 3.8f, 4, 20, false);
		Feline cat1 = new Feline("Whiskers", null, "Female", 2, 1.5f, 4, 18, true, true);
		Feline lion1 = new Feline("Leo", "Golden", "Male", 2, 5.3f, 4, 25, false, false);
		Primate gorilla1 = new Primate("Winston", "Black", "Male", 2, 5.6f, 2, 2, false, "Omnivore");
		Primate monkey1 = new Primate("Chuckles", "Black", "Male", 2, 3.5f, 2, 2, true,	"herbivore");
		Fish grouper1 = new Fish("Guss", "Green", "Male", 2, 1.2f, 4, true);
		Fish shark1 = new Fish("Nibbles", "Gray", "Male", 2, 3.4f, 5, false);
		
		ourZoo.add(cow1);
		ourZoo.add(cow2);
		ourZoo.add(dog1);
		ourZoo.add(wolf1);
		ourZoo.add(cat1);
		ourZoo.add(lion1);
		ourZoo.add(gorilla1);
		ourZoo.add(monkey1);
		ourZoo.add(grouper1);
		ourZoo.add(shark1);
		
		System.out.println("Today at the zoo I saw a... ");
		
		for (int i = 0; i < ourZoo.size(); i++) {
			System.out.println(ourZoo.get(i).toString());
		}
	}

}
