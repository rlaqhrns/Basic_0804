
package exColloction;

public class Player implements Comparable<Player> {
	private String name;
	private int score;
	private int number;

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		// return this.name.compareTo(o.getName());//String name 정
		// return -(o.getScore() - this.score);//int score 정렬
		return o.getNumber() - this.number;
		// 양수냐 음수냐에 따라서 오름차순 내림차순 결정
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public Player(String name, int score, int number) {
		this.name = name;
		this.score = score;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
