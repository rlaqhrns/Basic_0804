package exColloction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
//		1급 객체 (first citizen)
//		변수에 저장 가능
//		함수의 파라미터로 전달 가능
//		함수에서 return 가능
//		만약 함수가 일급 객체라면
//		변수에 함수 저장 쌉가능
//		함수의 파라미터로 함수를 전달 가능
//		함수에서 함수를 반환 가능함
//		자바에서 함수형 언어를 차용해서 함수를 위와 같이 사용가능함
//		그런데 람다는 이름없는 함수이므로
//		함수의 파라미터로 전달 쌉가능

		List<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(10);
		al.add(13);
		al.add(9);
		al.add(7);
		al.add(6);

		al.forEach(i -> System.out.println(i * 4));
		System.out.println();
		al.forEach(i -> {
			System.out.println("아래와 같이 여러개의 문자를 추가 가능");
			System.out.println("2배한 결과 " + i * 2);
			System.out.println("3배한 결과 " + i * 3);
			System.out.println("4배한 결과 " + i * 4);
		});

		al.removeIf(i -> (i % 3 == 0));
		System.out.println(al);

//		dic.put("baby", "아기");
//		dic.put("love", "사랑");
//		dic.put("apple", "사과");
//		dic.put("man", "아기");
//		dic.put("man", "남");
//
//		Set<String> keys = dic.keySet();
//		Iterator<String> itr = keys.iterator();
//		while (itr.hasNext()) {
//			String key1 = itr.next();
//			String value = dic.get(key1);
//			System.out.println("( " + key1 + ", " + value + " )");
//
//		}
//		System.out.println();
//		
//		for(String di : dic.keySet()) {
//			System.out.println(di + " " + dic.get(di));
//		}
//		
//		
//		
//		
//		

//
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < dic.size(); i++) {
//			System.out.print("input : ");
//			String eng = sc.next();
//			String kor = dic.get(eng);
//			if (kor == null) {
//				System.out.println(eng + " is nothing");
//
//			} else {
//				System.out.println(kor);
//			}
//
//		}
//		sc.close();

	}
}
