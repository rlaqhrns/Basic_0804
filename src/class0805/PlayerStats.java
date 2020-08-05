package class0805;

public abstract class PlayerStats {

	protected String player;
	protected String team;
	protected int score;
	
	PlayerStats(String player,String team){
		this.player = player;
		this.team = team;
		this.score = 0;
	}
	
	public abstract void earnScore(int point);
	
	
	public String toString() {
		return "선수 " + this.player + " 팀 " +this.team + " 득점수 " + this.score;
		
	}
	
	
	
	
	
}
