package exColloction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("홍길동",123,7));
		players.add(new Player("김창수",523,2));
		players.add(new Player("박머군",63,66));
		players.add(new Player("최이박",15,22));
		
		//Comparator<Player> comparator = new Comparator<Player>();
		Collections.sort(players,(a,b) -> -(b.getNumber() - a.getNumber()));
		
		for(Player i : players) {
			System.out.println(i.getName() +" " + i.getScore()+"점");
			System.out.println(i.getNumber());
		}
		
	}

}
