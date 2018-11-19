
public class Formation {
	SoccerPlayer[] players;
	
	public Formation(SoccerPlayer[] players) {
		this.players = players;

		if (!isValid())
			System.out.println("invalid formation");
	}
	
	protected boolean isValid() {
		boolean b = false;
		if(players.length == 11) {
			for(int i=0; i<11; i++) {
				if(players[i].canUseHands() && b)
					return false;
				else if(players[i].canUseHands())
					b = true;
			}
		}
		return b;
	}
	
	public final String toString() {
		String r = "";
		
		for (int i=0; i<10; i++)
			r += (players[i] + ", ");
		r += (players[10] + "\n");
		return r;
	}

}
