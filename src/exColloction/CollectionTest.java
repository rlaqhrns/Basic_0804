package exColloction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(-2);
		al.add(3);
		al.add(2,4);

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		System.out.println();
		for (Integer i : al) {
			System.out.println(i);
		}

	}

}
