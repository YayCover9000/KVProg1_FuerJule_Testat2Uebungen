package GPSEntfernungen.GPSEntfernungen_2;
import java.util.Scanner;
public class GPSEntfernungenTesttreiber {
	public static final double LICHTGESCHWINDIGKEIT_MS = 299792458; // Lichtgeschwindigkeit in m/s

	public static void main(String [] args) {
		GPSEntfernungenTesttreiber blobfish = new GPSEntfernungenTesttreiber();
	}
	public GPSEntfernungenTesttreiber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] laufzeiten = new int[n];
		double[] entfernungen = new double[n];
		
		for(int i = 0; i < laufzeiten.length; i++) {
			laufzeiten[i] = (int) (Math.random() * (Integer.MAX_VALUE - 80) + 80); // Zufällige Zahl größer als 80
		}
		GPSEntfernungen.berechneEntfernungen(laufzeiten,entfernungen);
		GPSEntfernungen.ausgeben(entfernungen);
	}
	
}
