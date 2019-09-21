
public class MainApp {

	public static void main(String[] args) {
		
		// Create main UI instance
		// database connection for biometrics
		Player mainPlayer = new Player();
		
		
		//testing
		viewStats(mainPlayer);
		trainingMode(mainPlayer);
		viewStats(mainPlayer);
	}
	
	public static void viewStats(Player player) {
		
		Skill strength = player.getStrengthSkill();
		Skill hp = player.getHitPointsSkill();
		int combatLevel = player.getCombatLevel();
		
		int strengthLevel = strength.getLevel();
		int hpLevel = hp.getLevel();
		
		// testing
		System.out.println("Strength: " + strengthLevel);
		System.out.println("HitPoints: " + hpLevel);
		System.out.println("Combat: " + combatLevel);
	}
	
	public static void trainingMode(Player player) {
		
		// training data
		int addedXp = 5000000;
		System.out.println("\nTraining...\n");
		
		Skill skill = player.getStrengthSkill();
		player.trainSkill(skill, addedXp);
	}
	
	public static void battleMode(Player player) {
		
		// implemented later
		
	}

}
