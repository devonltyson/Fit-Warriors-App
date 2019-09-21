
public class MainApp {

	public static void main(String[] args) {
		
		// Create all database connections
		// Create main UI instance
		Controller manager = new Controller();
		Player mainPlayer = new Player();
		
		
		// testing
		manager.viewStats(mainPlayer);
		manager.trainingMode(mainPlayer);
		manager.viewStats(mainPlayer);
	}

}
