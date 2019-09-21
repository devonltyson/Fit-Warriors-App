
public class MainApp {

	public static void main(String[] args) {
		
		// Create main UI instance
		// database connection for biometrics
		Manager manager = new Manager();
		Player mainPlayer = new Player();
		
		
		//testing
		manager.viewStats(mainPlayer);
		manager.trainingMode(mainPlayer);
		manager.viewStats(mainPlayer);
	}

}
