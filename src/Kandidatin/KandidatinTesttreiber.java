package Kandidatin;

public class KandidatinTesttreiber {
	public static void main(String [] args) {
		Kandidatin topmodel = new Kandidatin("Claudia",1.79f);
		Kandidatin topmodel1 = new Kandidatin("Claudia");
		Kandidatin topmodel2 = new Kandidatin(1.79f);
		String topmodelName = topmodel.getName();
		float topmodelGroesselnM = topmodel.getGroesselnM();
		
		System.out.println("Name: " + topmodelName + " GroesselnM: " + topmodelGroesselnM);
	}
}
