
public class Main {

	public static void main(String[] args) {
		
		Formation433 f = new Formation433(new GoalKeeper("Szczesny"),
		new Defence("Alex Sandro"),
		new Defence("Rugani"),
		new Defence("Chiellini"),
		new Defence("Dani Alves"),
		new Midfield("Fabinho"),
		new Midfield("Iniesta"),
		new Midfield("Pjanic"),
		new Forward("Dybala"),
		new Forward("Higuain"),
		new Forward("Bernardeschi"));
		
		System.out.println(f);

	}
}
