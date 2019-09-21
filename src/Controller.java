
public class Controller {
	
	Player player;
	
	public Controller(Player player) {
		this.player = player;
	}

	public void viewStats() {
		
		Skill strength = player.getStrengthSkill();
		Skill hp = player.getHitPointsSkill();
		
		int combatLevel = player.getCombatLevel();
		int strengthLevel = strength.getLevel();
		int hpLevel = hp.getLevel();
		
		//testing stats viewer
		System.out.println("-- Player Statistics --");
		System.out.println("Combat Level: " + combatLevel);
		System.out.println("Strength Level: " + strengthLevel);
		System.out.println("Hitpoints Level: " + hpLevel);
		System.out.println();
	}
	
	public void trainingMode(Skill skill, int addedXp) {

		Skill hp = player.getHitPointsSkill();
		player.trainSkill(skill, addedXp);
		player.trainSkill(hp, addedXp);
	}
	
	public void battleMode(Player other) {
		
		// implemented later
		
	}
	
}
