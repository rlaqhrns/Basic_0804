package class0805;

public class BaseballStats extends PlayerStats {
	private int hits;
	private int errors;

	public int getHits() {
		return hits;
	}

	public int getErrors() {
		return errors;
	}

	public BaseballStats(String player, String team) {

		super(player, team);
		hits = 0;
		errors = 0;

	}

	@Override
	public void earnScore(int point) {
		// TODO Auto-generated method stub
		super.score += point;
	}

	public void gainHit() {
		hits++;
	}

	public void commitError() {
		errors++;

	}

	public String toString() {
		return super.toString() + "\n안타수 : " + hits + "\n에러수 : " + errors;
	}

}
