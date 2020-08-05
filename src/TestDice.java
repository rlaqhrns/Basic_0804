import java.util.Scanner;

public class TestDice {
	public static void main(String[] args) {
		String flag = "yes";
		Scanner sc = new Scanner(System.in);
		PairOfDice pod = new PairOfDice();
		Player player1 = new Player();
		Player player2 = new Player();
		do {
			pod.roll();
			player1.setGame(pod);
			pod.roll();
			player2.setGame(pod);

			System.out.println("선수이름 : " + player1.getName() + "\n주사위 : " + player1.getValue1() + ", "
					+ player1.getValue2() + "\n점수: " + player1.getTotal());
			System.out.println("선수이름 : " + player2.getName() + "\n주사위 : " +  player2.getValue1() + ", "
					+ player2.getValue2() + "\n점수: " + player2.getTotal());

			if (player1.getTotal() > player2.getTotal()) {
				System.out.println(player1.name + "가 " + player2.name + "을 이겼습니다.");
			} else if (player1.getTotal() < player2.getTotal()) {
				System.out.println(player2.name + "가 " + player1.name + "을 이겼습니다.");

			} else {
				System.out.println("무승부");
			}
			System.out.print("계속하시겠습니까? yes or no : ");
			flag = sc.next();
			
		} while (flag.equals("yes"));
	}
}