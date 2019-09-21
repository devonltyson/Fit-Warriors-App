
public class MainApp {

	public static void main(String[] args) {
		
		// Create all database connections
		// Create main UI instance
		Player mainPlayer = new Player();
		Controller manager = new Controller(mainPlayer);
		
		
		// testing
		manager.viewStats();
		
		Skill skill = mainPlayer.getStrengthSkill();
		int xp = 15000;
		manager.trainingMode(skill, xp);
		
		manager.viewStats();
	}

}
