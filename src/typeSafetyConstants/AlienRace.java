package typeSafetyConstants;

public final class AlienRace {
	public static final AlienRace TERRAN = new AlienRace(5, "human");
	public static final AlienRace PROTOSS = new AlienRace(10, "robot");
	public static final AlienRace ZERG = null;
	private int armor;
	private String disc;
	private AlienRace (int armor_, String disc_){
		armor = armor_;
		disc = disc_;
	}
	public int getArmor(){
		return armor;
	}
	public String toString(){
		return disc;
	}
	
}
