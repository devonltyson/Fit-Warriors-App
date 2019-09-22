import java.util.*;
import java.util.Map.Entry;

public class MainApp {

	public static void main(String[] args) {
		
		// Create all database connections
		// Create main UI instance
		Player mainPlayer = new Player();
		Controller manager = new Controller(mainPlayer);
		
		
		//testing
		showStats(manager);
		
		Skill skill = mainPlayer.getStrengthSkill();
		int xp = 105000;
		manager.trainingMode(skill, xp);
		
		showStats(manager);
	}
	
	public static void showStats(Controller manager) {
		HashMap<String, Integer> stats = manager.playerStats();
		
		for (Entry<String, Integer> entry : stats.entrySet())  
            System.out.println(entry.getKey() + 
                             ": " + entry.getValue());
		System.out.println();
	}

}
