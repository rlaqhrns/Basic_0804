package exColloction;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {

		final int LIMIT = 10;
		String source = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		List<String> list = new ArrayList<String>(source.length() / LIMIT + 10);

		for (int i = 0; i < source.length(); i += LIMIT) {
			if (i + LIMIT < source.length()) {
				list.add(source.substring(i, i + LIMIT));
			} else {
				list.add(source.substring(i));
			}
		}
		for (String i : list) {
			System.out.println(i);
		}
		
	}
}
