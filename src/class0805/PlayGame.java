package class0805;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballStats base = new BaseballStats("정민", "KIA");
		BaskeballStats basket = new BaskeballStats("오우공", "NBA");
		
		base.gainHit();
		base.gainHit();
		base.commitError();
		base.earnScore(1);
		base.gainHit();
		base.earnScore(1);
		
		basket.earnScore(2);
		basket.gainRebounds();
		basket.gainAssist();
		basket.earnScore(3);
		basket.gainAssist();
		basket.gainRebounds();
		basket.gainAssist();
		
		System.out.println(base);
		System.out.println(basket);
		
		
		
		
	}

}
