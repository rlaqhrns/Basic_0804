import java.util.Scanner;

public class Player {
	String name;
	int total;
	int value1;
	public int getValue1() {
		return value1;
	}

	public void setValue1(PairOfDice pod) {
		this.value1 = pod.faceValue1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(PairOfDice pod) {
		this.value2 = pod.faceValue2;
	}

	int value2;
	
	
	Scanner sc = new Scanner(System.in);
	
	Player(){
		System.out.print("선수 이름 입력 : ");
		setName(sc.next());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.total = 0;
		this.name = name;
	}

	public int getTotal() {
		return total;
	}
	

	public void setTotal() {
		this.total = getValue1() + getValue2();
	}
	public void setGame(PairOfDice pod) {
		setValue1(pod);
		setValue2(pod);
		setTotal();
		
	}
}