package test01;

public class Undergrduate extends Student {

	String clubName;

	public Undergrduate() {

		super();
		clubName = "";

	}

	public Undergrduate(String name, int number, String clubName) {

		super(name, number);
		this.clubName = clubName;

	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public boolean equals(Undergrduate other) {
		return (super.equals(other))&&(getClubName().equals(other.clubName));
	}
	
	@Override
	public String toString() {
		String result;
		result = super.toString() + ", 동아리 이름 : " + getClubName();

		return result;
	}

}
