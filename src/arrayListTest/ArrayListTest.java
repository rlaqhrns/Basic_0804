package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add(new Integer((int)(Math.random()*10)));

		}
		List<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		System.out.println("정렬 전의 데이터");
		for(Integer i : list1)System.out.print(i+" ");
		System.out.println();
		for(Integer i : list2)System.out.print(i+" ");
		System.out.println();
		
//		Collections.sort(list1);
//		Collections.sort(list2);
//		
//		System.out.println("정렬 후의 데이터");
//		for(Integer i : list1)System.out.print(i+" ");
//		System.out.println();
//		for(Integer i : list2)System.out.print(i+" ");
//		System.out.println();
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		list2.add(1,999);
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		System.out.println(list1 + " " + list2);
		
		for(int i = list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))){
				list2.remove(i);
			}
		}
		
		System.out.println(list1 + " " + list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
