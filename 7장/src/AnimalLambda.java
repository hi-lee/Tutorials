//Ex7_02
import java.util.*;

public class AnimalLambda {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Dog", 4);
		Animal animal2 = new Animal("Pig", 2);
		Animal animal3 = new Animal("Snake", 8);
		
		List<Animal> animallist = new ArrayList<>();
		animallist.add(animal1);
		animallist.add(animal2);
		animallist.add(animal3);
		
		System.out.println("입력순 : " + animallist);
//		오름차순정렬
		Collections.sort(animallist, (a,b) -> a.age - b.age);
		System.out.println("오름차순 정렬 : " + animallist);
//		내림차순정렬
		Collections.sort(animallist, (a,b) -> b.age - a.age);
		System.out.println("내림차순 정렬 : " + animallist);
		
	}
}
