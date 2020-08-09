package class0805;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Question q1;
		Question q2;

		q1 = new Question("한국의 국화는? ", "무궁화");

		q2 = new Question("한국에서 가장 높은 산은?", "한라산");

		q1.setComplexity(3);
		q2.setComplexity(7);

		System.out.println(q1.getQuestion());

		String ans = sc.next();

		if (q1.correct(ans)) {
			System.out.println(q1.getAnswer() + " 정답!!");
		} else {
			System.out.println("오답!! 정답은 : " + q1.getAnswer());
		}
		System.out.println(q2.getQuestion());

		ans = sc.next();

		if (q2.correct(ans)) {
			System.out.println(q2.getAnswer() + " 정답!!");
		} else {
			System.out.println("오답!! 정답은 : " + q2.getAnswer());
		}

	}

}
