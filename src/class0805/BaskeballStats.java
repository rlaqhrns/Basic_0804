package class0805;

public class BaskeballStats extends PlayerStats {
	private int assist;
	private int rebounds;

	BaskeballStats(String player, String team) {
		super(player, team);
		assist = 0;
		rebounds = 0;

	}

	@Override
	public void earnScore(int point) {
		// TODO Auto-generated method stub
		score += point;
	}

	public void gainAssist() {
		assist++;
	}

	public void gainRebounds() {
		rebounds++;

	}

	public String toString() {
		return super.toString() + "\nassist : " + assist + " \nrebound : " + rebounds;
	}

}
