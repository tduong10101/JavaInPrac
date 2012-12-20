package typeSafetyConstants;

public class Tester {
	public static void test(){
		consTest(AlienRace.PROTOSS);
	}
	public static void consTest(AlienRace alien){
		if (alien == AlienRace.TERRAN){
			System.out.println(AlienRace.TERRAN +" This is a demonstration of safety type");
		}
		if (alien == AlienRace.PROTOSS){
			System.out.println(AlienRace.PROTOSS);
		}
	}
}
