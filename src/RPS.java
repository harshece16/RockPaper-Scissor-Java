public class RPS {
	//Instance variables declaration
	private Computer player1;
	private Computer player2;
	private Computer player3;
	private Computer player4;
	private static int playerScore1;
	private static int playerScore2;
	private static int playerScore3;
	private static int playerScore4;
	private static int numberOfGames;

	public RPS() {
		player1 = new Computer();
		player2 = new Computer();
		player3 = new Computer();
		player4 = new Computer();
		playerScore1 = 0;
		playerScore2 = 0;
		playerScore3 = 0;
		playerScore4 = 0;
		numberOfGames = 1;
	}
	public static String startGame() {
		String s = "No. Player1 Player2 Player3 Player4 \n" ;
		while(numberOfGames<50)
		{
			   
			int p1input = Computer.getInput();
			int p2input = Computer.getInput();
			int p3input = Computer.getInput();
			int p4input = Computer.getInput();
			s =s + (numberOfGames +1)+  "    " +  Driver.display(p1input)+ "    " +  Driver.display(p2input)+ "   " +  Driver.display(p2input)+ "    " +  Driver.display(p4input)+ "\n";
			
			int compareResult1=Driver.compareSelections(p1input, p2input);
			switch (compareResult1) {
			case 0: 
				break;
			case 1: 
				playerScore1++;
				break;
			case -1: 
				playerScore2++;
				break;
			}
			int compareResult2=Driver.compareSelections(p1input, p3input);
			switch (compareResult2) {
			case 0: 
				break;
			case 1: 
				playerScore1++;
				break;
			case -1: 
				playerScore3++;
				break;
			}
			int compareResult3=Driver.compareSelections(p1input, p4input);
			switch (compareResult3) {
			case 0: 
				break;
			case 1: 
				playerScore1++;
				break;
			case -1: 
				playerScore4++;
				break;
			}
			int compareResult4=Driver.compareSelections(p2input, p3input);
			switch (compareResult4) {
			case 0: 
				break;
			case 1: 
				playerScore2++;
				break;
			case -1: 
				playerScore3++;
				break;
			}
			int compareResult5=Driver.compareSelections(p2input, p4input);
			switch (compareResult5) {
			case 0: 
				break;
			case 1: 
				playerScore2++;
				break;
			case -1: 
				playerScore4++;
				break;
			}
			int compareResult6=Driver.compareSelections(p3input, p4input);
			switch (compareResult6) {
			case 0: 
				break;
			case 1: 
				playerScore3++;
				break;
			case -1: 
				playerScore4++;
				break;
			}
			numberOfGames++;
		}
		s = s + "Player 1 Points is " + playerScore1 + "\n";
		s = s + "Player 2 Points is " + playerScore2 + "\n";
		s = s + "Player 3 Points is " + playerScore3 + "\n";
		s = s + "Player 4 Points is " + playerScore4 + "\n";
		return s ;
	}
}
