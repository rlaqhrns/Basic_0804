package class0805;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> item = new ArrayList<Animal>();
		int index;
		item.add(new Bird());
		item.add(new Dog());
		item.add(new Fish());
		
		for(Animal i : item) {
			 i.move();
		}
	}

}
