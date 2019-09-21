
public class Hitpoints extends Skill {
	
	int level, xp, goalXp;

	public Hitpoints() {
		super.level = 10;
		this.xp = super.xp;
		this.goalXp = super.goalXp;	
	}
	
	
	@Override
	public void train(int addedXp) {
		this.xp += (addedXp/3); // hp levels slower than other skills
	}
}
