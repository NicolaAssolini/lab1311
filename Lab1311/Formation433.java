
public class Formation433 extends Formation {

	public Formation433(SoccerPlayer... players) {
		super(players);
	}
	
	protected boolean isValid() {
		int d=0;
		int c=0; 
		int a=0;
		
		if(super.isValid()) {
			for(int i=0; i<11; i++) {
				if (players[i] instanceof Defence)
					d++;
				else if (players[i] instanceof Midfield)
					c++;
				else if (players[i] instanceof Forward)
					a++;
			}
			if(a == 3 && c == 3 && d == 4)
				return true;
		}
		return false;
	}
}
