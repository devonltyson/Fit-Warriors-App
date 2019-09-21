
public class Player {
	
	private Skill strength, hp;
	private int combatLevel;
	
	public Player() {
		this.strength = new Strength();
		this.hp = new Hitpoints();
		this.combatLevel = 1;
	}
	
	public int getCombatLevel() {
		return this.combatLevel;
	}
	
	public Skill getStrengthSkill() {
		return this.strength;
	}
	
	public Skill getHitPointsSkill() {
		return this.hp;
	}
	
	public void calculateCombatLevel() {
		this.combatLevel = (this.strength.getLevel()/3) + (this.hp.getLevel()/5);
	}
	
	public void trainSkill(Skill skill, int addedXp) {
		skill.train(addedXp);
	}

}
