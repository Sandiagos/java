package objectOrientedConcepts;

@SuppressWarnings("unused")
public class VideoGame {
	
	//states [fields] [variables]
	public String title = "title";
	public String platform = "All";
	public int players = 0;
	public String genre = "None";
	public double completionTime = 0; //in hours
	public boolean onlineMulti = false;
	
	//behaviours [methods]
	public void changeTitle(String newvalue) {
		title = newvalue;
	}
	
	public void changePlatform(String newvalue) {
		platform = newvalue;
	}
	
	public void maxPlayer(int newvalue) {
		players = newvalue;
	}
	
	public void changeGenre(String newvalue) {
		genre = newvalue;
	}
	
	public void changeCompletionTime(double newvalue) {
		completionTime = newvalue;
	}
	
	public void setOnlineMulti(boolean newvalue) {
		onlineMulti = newvalue;
	}
}
