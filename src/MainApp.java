import java.util.*;
import java.util.Map.Entry;

public class MainApp {

	public static void main(String[] args) {
		
		// Create all database connections
		// Create main UI instance
		Player mainPlayer = new Player();
		Controller manager = new Controller(mainPlayer);
		View viewer = new View(manager);
		
		//testing
		viewer.showStats();
		
		Skill skill = mainPlayer.getStrengthSkill();
		int xp = 20000;
		manager.trainingMode(skill, xp);
		
		viewer.showStats();
	}
	
	public static void saveData() {
		
	}
	
	public static void getData() {
		
	}

}
