package exColloction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest01 {
	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("input name : ");
			String s = sc.next();
			str.add(s);
		}

		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));

		}
		int longestIndex = 0;
		for (int i = 0; i < str.size(); i++) {
			if (str.get(longestIndex).length() < str.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.print("longest name is : " + str.get(longestIndex));
		sc.close();

	}
}
