package typeSafetyConstants;

public class TestRun {
	public static void main (String arg[]){
		Tester tester1 = new Tester();
		tester1.test();
		tester1.consTest(AlienRace.TERRAN);
	}
}
