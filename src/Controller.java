
public class Controller {

	public void viewStats(Player player) {
		
		Skill strength = player.getStrengthSkill();
		Skill hp = player.getHitPointsSkill();
		
		int combatLevel = player.getCombatLevel();
		int strengthLevel = strength.getLevel();
		int hpLevel = hp.getLevel();
		
		//testing stats viewer
		System.out.println("Combat Level: " + combatLevel);
		System.out.println("Strength Level: " + strengthLevel);
		System.out.println("Hitpoints Level: " + hpLevel);
	}
	
	public void trainingMode(Player player) {
		
		// training data
		int addedXp = 910000;
		System.out.println("\nTraining...\n");
		
		Skill skill = player.getStrengthSkill();
		Skill hp = player.getHitPointsSkill();
		player.trainSkill(skill, addedXp);
		player.trainSkill(hp, addedXp);
	}
	
	public void battleMode(Player player, Player other) {
		
		// implemented later
		
	}
	
}
