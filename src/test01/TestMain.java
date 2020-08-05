package test01;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Undergrduate stu1 = new Undergrduate();
		Undergrduate stu2 = new Undergrduate("선남", 1601, "로봇");

		stu1.setName("선남");
		stu1.setNumber(1601);
		stu1.setClubName("로봇");

		

		System.out.println(stu1);
		System.out.println(stu2);
		
		if(stu1.equals(stu2)) {
			System.out.println("두 체는 같다.");
		}else {
			System.out.println("두 객체는 다르다.");
		}
	}

}
