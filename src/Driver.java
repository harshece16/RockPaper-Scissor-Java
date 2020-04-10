public class Driver {
	
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;

	public static String display(int s) {
		switch (s) {
		case Driver.ROCK:
			return ("Rock");
		case Driver.PAPER:
			return ("Paper") ;
		case Driver.SCISSORS:
			return ("Scissors") ; 
		default:
			break;
		}
		return null;
	}
	
	public static int compareSelections(int userSelection, int computerSelection) {
		if(userSelection==computerSelection) return 0;
		switch (userSelection) {
		case ROCK:
			return (computerSelection == SCISSORS ? 1 : -1);

		case PAPER:
			return (computerSelection == ROCK ? 1 : -1);

		case SCISSORS:
			return (computerSelection == PAPER ? 1 : -1);
		}
		return 0;
	}
}
	
