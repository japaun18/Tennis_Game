import java.util.Scanner;


public class TennisGame {
	
	
	private int p1;
	private int p2;
	private int scoreFlag;
	private int pelaaja;
	private int tulos;
	private int tulos2;
	
	
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		System.out.println("Type 1 for player1 and 2 for player2");
				
		
		Scanner console = new Scanner(System.in);
		pelaaja = console.nextInt();
		
		public static void main(String[] args) {
			
			For (int i=1; i>=1; i++ ) {

	    	

	    	if (pelaaja == 1) {
	    		System.out.println("Pelaaja 1 saa pisteen");
	    		p1 += 15;
	    	}
	    	
	    	if (pelaaja == 2) {
	    		System.out.println("Pelaaja 2 saa pisteen");
	    		p2 += 15;
	    	}
	    
		
		
		
		
		
		
		
		
			}
		}
		
		
		
		
		
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		return "";
	}
}
