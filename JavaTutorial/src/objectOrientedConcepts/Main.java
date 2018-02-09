package objectOrientedConcepts;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		
		//create a VideoGame object called new game
		VideoGame newgame = new VideoGame();
		
		//Invoke methods on the new game object
		newgame.changeTitle("Awesome Sauce");
		newgame.changePlatform("PC");
		newgame.changeGenre("RTS");
		newgame.changeCompletionTime(19);
		newgame.setOnlineMulti(true);
		newgame.maxPlayer(6);
		
		//print the states of the new game object
		System.out.println("Title: " + newgame.title +
						   "\nPlatform: " + newgame.platform + 
						   "\nGenre: " + newgame.genre + 
						   "\nCompletion time: " + newgame.completionTime + 
						   "\nOnline multiplayer: " + newgame.onlineMulti + 
						   "\nMax number of players: " + newgame.players);
	}

}
